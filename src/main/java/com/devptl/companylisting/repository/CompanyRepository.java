package com.devptl.companylisting.repository;

import com.devptl.companylisting.model.Company;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompanyRepository extends MongoRepository<Company,String>
{

}
