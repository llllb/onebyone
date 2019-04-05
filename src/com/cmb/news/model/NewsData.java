package com.cmb.news.model;

import java.util.Date;

public class NewsData {
    private Long id;

    private Date createdTime;

    private Integer uid;

    private byte[] newsData;

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

    public byte[] getNewsData() {
        return newsData;
    }

    public void setNewsData(byte[] newsData) {
        this.newsData = newsData;
    }
}