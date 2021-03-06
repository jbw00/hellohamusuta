package com.hamusuta.hellohamusuta.dao;

import com.hamusuta.hellohamusuta.model.Type;
import com.hamusuta.hellohamusuta.model.TypeExample;
import java.util.List;

import com.hamusuta.hellohamusuta.model.custom_model.TypeIdAndName;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeMapper {
    long countByExample(TypeExample example);

    int deleteByExample(TypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Type record);

    int insertSelective(Type record);

    List<Type> selectByExample(TypeExample example);

    Type selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Type record, @Param("example") TypeExample example);

    int updateByExample(@Param("record") Type record, @Param("example") TypeExample example);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);

    List<TypeIdAndName> getTypeIdAndName();
}