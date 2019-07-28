package com.sparawhawk.mongodb.springbootmongodbexmple.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Address {
    @Id
    private Integer id;
    private String streetNo;
    private String city;
    private String state;
    private String country;

    public Address() {
    }

    public Address(Integer id, String streetNo, String city, String state, String country) {
        this.id = id;
        this.streetNo = streetNo;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
