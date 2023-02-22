package com.devptl.companylisting.controller;

import com.devptl.companylisting.model.Company;
import com.devptl.companylisting.repository.CompanyRepository;
import com.devptl.companylisting.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CompanyController
{

    @Autowired
    CompanyRepository repo;

    @Autowired
    SearchRepository srepo;

    @ApiIgnore
    @RequestMapping(value="/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/companies")
    @CrossOrigin
    public List<Company> getAllPosts()
    {
        return repo.findAll();
    }
    // posts/java
    @GetMapping("/company/{text}")
    @CrossOrigin
    public List<Company> search(@PathVariable String text)
    {
        return srepo.findByText(text);
    }

    @PostMapping("/company")
    @CrossOrigin
    public Company addCompany(@RequestBody Company company)
    {
        return repo.save(company);
    }


}
