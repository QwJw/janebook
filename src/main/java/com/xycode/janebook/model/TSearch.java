package com.xycode.janebook.model;

public class TSearch {
    private Integer id;

    private String searchName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName == null ? null : searchName.trim();
    }
}