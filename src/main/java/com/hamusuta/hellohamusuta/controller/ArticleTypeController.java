package com.hamusuta.hellohamusuta.controller;

import com.hamusuta.hellohamusuta.model.custom_model.TypeIdAndName;
import com.hamusuta.hellohamusuta.service.TypeService;
import com.hamusuta.hellohamusuta.vo.requestVo.TypeVo;
import com.hamusuta.hellohamusuta.vo.responseVo.ResponseResult;
import com.hamusuta.hellohamusuta.vo.responseVo.ResultGenerator;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/type")
public class ArticleTypeController {

    @Autowired
    private TypeService typeService;

    @ApiOperation(value = "新建文章类型", notes = "新建文章类型")
    @PostMapping(value = "/newtype")
    public ResponseResult insertNewType(@RequestBody TypeVo typeVo) {
        typeService.insertTypr(typeVo);
        return ResultGenerator.generatorSuccess();
    }

    @ApiOperation(value = "获取所有文章类型", notes = "获取所有文章类型")
    @GetMapping(value = "/gettypelist")
    public ResponseResult getTypeList() {
        List<TypeIdAndName> typeList = typeService.getTypeList();
        return ResultGenerator.generatorSuccess(typeList);
    }
}
