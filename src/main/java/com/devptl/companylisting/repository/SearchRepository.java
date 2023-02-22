package com.devptl.companylisting.repository;

import com.devptl.companylisting.model.Company;

import java.util.List;

public interface SearchRepository {

    List<Company> findByText(String text);

}
