package com.hamusuta.hellohamusuta.controller;

import com.hamusuta.hellohamusuta.service.ArticleService;
import com.hamusuta.hellohamusuta.vo.requestVo.ArticleVo;
import com.hamusuta.hellohamusuta.vo.responseVo.ResponseResult;
import com.hamusuta.hellohamusuta.vo.responseVo.ResultGenerator;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @ApiOperation(value = "新建文章", notes = "新建文章")
    @PostMapping(value = "/newarticle")
    public ResponseResult insertAtricle(@RequestBody ArticleVo articleVo){
        articleService.insertArticle(articleVo);
        return ResultGenerator.generatorSuccess();
    }
}
