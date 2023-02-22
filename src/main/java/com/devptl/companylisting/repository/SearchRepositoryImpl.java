package com.devptl.companylisting.repository;

import com.devptl.companylisting.model.Company;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
public class SearchRepositoryImpl implements SearchRepository{

    @Autowired
    MongoClient client;

    @Autowired
    MongoConverter converter;

    @Override
    public List<Company> findByText(String text) {

        final List<Company> companies = new ArrayList<>();

        MongoDatabase database = client.getDatabase("sample_training");
        MongoCollection<Document> collection = database.getCollection("companies");


        // Aggregation is imported from mongodb
        AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$search",
                        new Document("text",
                        new Document("query", text)
                        .append("path", Arrays.asList("name", "twitter_username", "number_of_employees")))),
                        new Document("$sort",
                        new Document("exp", 1L)),
                        new Document("$limit", 5L)));

        result.forEach(doc -> companies.add(converter.read(Company.class,doc)));

        return companies;
    }
}
