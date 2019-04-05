package com.cmb.news.dao;

import com.cmb.news.model.NewsData;

public interface NewsDataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NewsData record);

    int insertSelective(NewsData record);

    NewsData selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NewsData record);

    int updateByPrimaryKeyWithBLOBs(NewsData record);

    int updateByPrimaryKey(NewsData record);
}