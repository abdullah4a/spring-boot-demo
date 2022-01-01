package com.example.demo;

public class BranchModel {

    private Long webId;
    private String fullBranchName;
    private String branchNumber;
    private String companyId;
    private String faxNumber;
    private String description;
    private String email;
    private String url;
    private String phoneNumber;
    private Boolean active;
    private AddressModel address;

    public BranchModel(Long webId, String fullBranchName, String branchNumber, String companyId, String faxNumber, String description, String email, String url, String phoneNumber, Boolean active, AddressModel address) {
        this.webId = webId;
        this.fullBranchName = fullBranchName;
        this.branchNumber = branchNumber;
        this.companyId = companyId;
        this.faxNumber = faxNumber;
        this.description = description;
        this.email = email;
        this.url = url;
        this.phoneNumber = phoneNumber;
        this.active = active;
        this.address = address;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Long getWebId() {
        return webId;
    }

    public void setWebId(Long webId) {
        this.webId = webId;
    }

    public String getFullBranchName() {
        return fullBranchName;
    }

    public void setFullBranchName(String fullBranchName) {
        this.fullBranchName = fullBranchName;
    }

    public String getBranchNumber() {
        return branchNumber;
    }

    public void setBranchNumber(String branchNumber) {
        this.branchNumber = branchNumber;
    }

    public AddressModel getAddress() {
        return address;
    }

    public void setAddress(AddressModel address) {
        this.address = address;
    }
}
