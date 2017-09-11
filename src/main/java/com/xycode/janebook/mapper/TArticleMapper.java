package com.xycode.janebook.mapper;

import com.xycode.janebook.model.TArticle;
import com.xycode.janebook.model.TArticleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TArticleMapper {
    int countByExample(TArticleExample example);

    int deleteByExample(TArticleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TArticle record);

    int insertSelective(TArticle record);

    List<TArticle> selectByExampleWithBLOBs(TArticleExample example);

    List<TArticle> selectByExample(TArticleExample example);

    TArticle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TArticle record, @Param("example") TArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") TArticle record, @Param("example") TArticleExample example);

    int updateByExample(@Param("record") TArticle record, @Param("example") TArticleExample example);

    int updateByPrimaryKeySelective(TArticle record);

    int updateByPrimaryKeyWithBLOBs(TArticle record);

    int updateByPrimaryKey(TArticle record);
}