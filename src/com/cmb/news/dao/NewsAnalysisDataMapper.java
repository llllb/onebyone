package com.cmb.news.dao;

public interface NewsAnalysisDataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NewsAnalysisData record);

    int insertSelective(NewsAnalysisData record);

    NewsAnalysisData selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NewsAnalysisData record);

    int updateByPrimaryKeyWithBLOBs(NewsAnalysisData record);

    int updateByPrimaryKey(NewsAnalysisData record);
}