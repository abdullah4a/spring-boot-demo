package com.example.demo;

import java.util.Date;

public class UserModel {
    private Long webId;
    private String firstName;
    private String lastName;
    private String userNumber;
    private String title;
    private String email;
    private String state;
    private String company;
    private String carrierNetwork;
    private String gender;
    private Date dob;
    private String country;
    private String city;
    private AddressModel address;

    public UserModel(Long webId, String firstName, String lastName, String userNumber, String title, String email, String state, String company, String carrierNetwork, String gender, Date dob, String country, String city, AddressModel address) {
        this.webId = webId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userNumber = userNumber;
        this.title = title;
        this.email = email;
        this.state = state;
        this.company = company;
        this.carrierNetwork = carrierNetwork;
        this.gender = gender;
        this.dob = dob;
        this.country = country;
        this.city = city;
        this.address = address;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCarrierNetwork() {
        return carrierNetwork;
    }

    public void setCarrierNetwork(String carrierNetwork) {
        this.carrierNetwork = carrierNetwork;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public Long getWebId() {
        return webId;
    }

    public void setWebId(Long webId) {
        this.webId = webId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public AddressModel getAddress() {
        return address;
    }

    public void setAddress(AddressModel address) {
        this.address = address;
    }

}
