package com.hamusuta.hellohamusuta.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hamusuta.hellohamusuta.model.Article;
import com.hamusuta.hellohamusuta.service.ArticleService;
import com.hamusuta.hellohamusuta.vo.requestVo.ArticleVo;
import com.hamusuta.hellohamusuta.vo.responseVo.ArticleIndexVo;
import com.hamusuta.hellohamusuta.vo.responseVo.ResponseResult;
import com.hamusuta.hellohamusuta.vo.responseVo.ResultGenerator;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @ApiOperation(value = "获取文章目录", notes = "用于首页展示（预留于改造热帖查询）")
    @GetMapping(value = "/getartindex/{index}")
    public ResponseResult getAtricleIndex(@PathVariable Integer index){
        if(ObjectUtils.isEmpty(index))index = 1;
        List<ArticleIndexVo> articleIndex = articleService.getArticleIndex(index);
        return ResultGenerator.generatorSuccess(articleIndex);
    }

    @ApiOperation(value = "获取文章目录", notes = "获取文章目录")
    @PostMapping(value = "/getartpage")
    public ResponseResult getAtriclePage(@RequestParam Integer typeId, @RequestParam(defaultValue = "1") Integer pageNum){
        //默认size是6
        PageHelper.startPage(pageNum, 6);
        List<ArticleIndexVo> articlePage = articleService.getArticlePage(typeId);
        PageInfo<ArticleIndexVo> pageInfo = new PageInfo<ArticleIndexVo>(articlePage);
        return ResultGenerator.generatorSuccess(pageInfo);
    }

    @ApiOperation(value = "根据ID获取文章", notes = "获取文章实体")
    @GetMapping(value = "/getartindex/{id}")
    public ResponseResult getAtricleById(@PathVariable Integer id){
        Article atricleById = articleService.getAtricleById(id);
        return ResultGenerator.generatorSuccess(atricleById);
    }
}
