package com.xycode.janebook.mapper;

import com.xycode.janebook.model.TCommentaryFir;
import com.xycode.janebook.model.TCommentaryFirExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TCommentaryFirMapper {
    int countByExample(TCommentaryFirExample example);

    int deleteByExample(TCommentaryFirExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCommentaryFir record);

    int insertSelective(TCommentaryFir record);

    List<TCommentaryFir> selectByExample(TCommentaryFirExample example);

    TCommentaryFir selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCommentaryFir record, @Param("example") TCommentaryFirExample example);

    int updateByExample(@Param("record") TCommentaryFir record, @Param("example") TCommentaryFirExample example);

    int updateByPrimaryKeySelective(TCommentaryFir record);

    int updateByPrimaryKey(TCommentaryFir record);
}