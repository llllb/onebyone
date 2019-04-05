package com.cmb.news.dao;

import com.cmb.news.model.NewsAnalysisData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component("newsAnalysisDataMapper")
public interface NewsAnalysisDataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NewsAnalysisData record);

    int insertSelective(NewsAnalysisData record);

    NewsAnalysisData selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NewsAnalysisData record);

    int updateByPrimaryKeyWithBLOBs(NewsAnalysisData record);

    int updateByPrimaryKey(NewsAnalysisData record);

    List<Long> findIdsByTime(Map<Object,Object> map);

    List<NewsAnalysisData> findByIds(@Param("ids") List<Long> ids);

    int insertBatch(@Param("newsAnalysisData") List<NewsAnalysisData> newsAnalysisData);
}