package com.example.demo;

public class AddressModel {
    private Long webId;
    private String street;

    public AddressModel(Long webId, String street) {
        this.webId = webId;
        this.street = street;
    }

    public Long getWebId() {
        return webId;
    }

    public void setWebId(Long webId) {
        this.webId = webId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
