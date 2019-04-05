package com.cmb.news.model;

import java.util.Date;

public class NewsAnalysisData {
    private Long id;

    private Date createdTime;

    private Integer uid;

    private byte[] newsContent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public byte[] getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(byte[] newsContent) {
        this.newsContent = newsContent;
    }
}