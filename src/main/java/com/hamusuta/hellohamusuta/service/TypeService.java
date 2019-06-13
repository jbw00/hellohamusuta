package com.hamusuta.hellohamusuta.service;

import com.hamusuta.hellohamusuta.model.custom_model.TypeIdAndName;
import com.hamusuta.hellohamusuta.vo.requestVo.TypeVo;

import java.util.List;

public interface TypeService {

    //新建文章类型
    void insertTypr(TypeVo typeVo);

    //获取所有类型
    List<TypeIdAndName> getTypeList();
}
