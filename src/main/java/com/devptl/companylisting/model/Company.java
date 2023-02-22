package com.devptl.companylisting.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "companies")
public class Company {
//    private String profile;
//    private String desc;
//    private int exp;
//    private String techs[];


    private String name;
    private String number_of_employees;
    private int founded_year;
    private int founded_month;
    private int founded_day;
    private String homepage_url;
    private String blog_url;
    private String twitter_username;




    public Company() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber_of_employees() {
        return number_of_employees;
    }

    public void setNumber_of_employees(String number_of_employees) {
        this.number_of_employees = number_of_employees;
    }

    public int getFounded_year() {
        return founded_year;
    }

    public void setFounded_year(int founded_year) {
        this.founded_year = founded_year;
    }

    public int getFounded_month() {
        return founded_month;
    }

    public void setFounded_month(int founded_month) {
        this.founded_month = founded_month;
    }

    public int getFounded_day() {
        return founded_day;
    }

    public void setFounded_day(int founded_day) {
        this.founded_day = founded_day;
    }

    public String getHomepage_url() {
        return homepage_url;
    }

    public void setHomepage_url(String homepage_url) {
        this.homepage_url = homepage_url;
    }

    public String getBlog_url() {
        return blog_url;
    }

    public void setBlog_url(String blog_url) {
        this.blog_url = blog_url;
    }

    public String getTwitter_username() {
        return twitter_username;
    }

    public void setTwitter_username(String twitter_username) {
        this.twitter_username = twitter_username;
    }

    @Override
    public String toString() {
        return "Post{" +
                "name='" + name + '\'' +
                ", number_of_employees='" + number_of_employees + '\'' +
                ", founded_year=" + founded_year +
                ", founded_month=" + founded_month +
                ", founded_day=" + founded_day +
                ", homepage_url='" + homepage_url + '\'' +
                ", blog_url='" + blog_url + '\'' +
                ", twitter_username='" + twitter_username + '\'' +
                '}';
    }
}
