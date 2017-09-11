package com.xycode.janebook.mapper;

import com.xycode.janebook.model.TCollection;
import com.xycode.janebook.model.TCollectionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TCollectionMapper {
    int countByExample(TCollectionExample example);

    int deleteByExample(TCollectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCollection record);

    int insertSelective(TCollection record);

    List<TCollection> selectByExample(TCollectionExample example);

    TCollection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCollection record, @Param("example") TCollectionExample example);

    int updateByExample(@Param("record") TCollection record, @Param("example") TCollectionExample example);

    int updateByPrimaryKeySelective(TCollection record);

    int updateByPrimaryKey(TCollection record);
}