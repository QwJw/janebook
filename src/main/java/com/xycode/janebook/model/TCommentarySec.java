package com.xycode.janebook.model;

import java.util.Date;

public class TCommentarySec {
    private Integer id;

    private String reviewerName;

    private String beReviewerName;

    private String commentCont;

    private Date createTime;

    private String reviewerId;

    private String beReviewerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName == null ? null : reviewerName.trim();
    }

    public String getBeReviewerName() {
        return beReviewerName;
    }

    public void setBeReviewerName(String beReviewerName) {
        this.beReviewerName = beReviewerName == null ? null : beReviewerName.trim();
    }

    public String getCommentCont() {
        return commentCont;
    }

    public void setCommentCont(String commentCont) {
        this.commentCont = commentCont == null ? null : commentCont.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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