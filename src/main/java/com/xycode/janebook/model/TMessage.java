package com.xycode.janebook.model;

public class TMessage {
    private Integer id;

    private String type;

    private String mesContent;

    private String reviewerId;

    private String beReviewerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getMesContent() {
        return mesContent;
    }

    public void setMesContent(String mesContent) {
        this.mesContent = mesContent == null ? null : mesContent.trim();
    }

    public String getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(String reviewerId) {
        this.reviewerId = reviewerId == null ? null : reviewerId.trim();
    }

    public String getBeReviewerId() {
        return beReviewerId;
    }

    public void setBeReviewerId(String beReviewerId) {
        this.beReviewerId = beReviewerId == null ? null : beReviewerId.trim();
    }
}