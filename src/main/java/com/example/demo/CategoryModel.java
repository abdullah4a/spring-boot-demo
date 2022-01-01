package com.example.demo;

import java.util.Date;

public class CategoryModel {

    private Long webId;
    private String categoryNumber;
    private String categoryName;
    private String subCategory;

    public CategoryModel(Long webId, String categoryNumber, String categoryName, String subCategory) {
        this.webId = webId;
        this.categoryNumber = categoryNumber;
        this.categoryName = categoryName;
        this.subCategory = subCategory;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public Long getWebId() {
        return webId;
    }

    public void setWebId(Long webId) {
        this.webId = webId;
    }

    public String getCategoryNumber() {
        return categoryNumber;
    }

    public void setCategoryNumber(String categoryNumber) {
        this.categoryNumber = categoryNumber;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
