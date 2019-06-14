package com.hamusuta.hellohamusuta.service;

import com.hamusuta.hellohamusuta.model.Article;
import com.hamusuta.hellohamusuta.vo.requestVo.ArticleVo;
import com.hamusuta.hellohamusuta.vo.responseVo.ArticleIndexVo;

import java.util.List;

public interface ArticleService {

    //新建文章
    void insertArticle(ArticleVo articleVo);

    //获取文章目录
    List<ArticleIndexVo> getArticleIndex(Integer index);

    //分页获取文章目录
    List<ArticleIndexVo> getArticlePage(Integer typeId);

    //根据id获取文章内容
    Article getAtricleById(Integer id);

}
