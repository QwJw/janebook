package com.xycode.janebook.mapper;

import com.xycode.janebook.model.TSearch;
import com.xycode.janebook.model.TSearchExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TSearchMapper {
    int countByExample(TSearchExample example);

    int deleteByExample(TSearchExample example);

    int insert(TSearch record);

    int insertSelective(TSearch record);

    List<TSearch> selectByExample(TSearchExample example);

    int updateByExampleSelective(@Param("record") TSearch record, @Param("example") TSearchExample example);

    int updateByExample(@Param("record") TSearch record, @Param("example") TSearchExample example);
}