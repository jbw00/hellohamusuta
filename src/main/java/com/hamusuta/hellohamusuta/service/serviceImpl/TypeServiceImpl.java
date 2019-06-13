package com.hamusuta.hellohamusuta.service.serviceImpl;

import com.hamusuta.hellohamusuta.dao.TypeMapper;
import com.hamusuta.hellohamusuta.model.Type;
import com.hamusuta.hellohamusuta.model.custom_model.TypeIdAndName;
import com.hamusuta.hellohamusuta.service.TypeService;
import com.hamusuta.hellohamusuta.vo.requestVo.TypeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeMapper typeMapper;

    @Override
    public void insertTypr(TypeVo typeVo) {
        Type type = formatType(typeVo);
        typeMapper.insert(type);
    }

    @Override
    public List<TypeIdAndName> getTypeList() {
        List<TypeIdAndName> typeIdAndNameList = typeMapper.getTypeIdAndName();
        return typeIdAndNameList;
    }

    //转换类型对象
    private Type formatType(TypeVo typeVo){
        Type type = new Type();
        type.setDate(new Date());
        type.setName(typeVo.getName());
        type.setStatus(typeVo.getStatus());
        return type;
    }
}
