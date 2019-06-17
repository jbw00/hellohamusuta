package com.hamusuta.hellohamusuta.service.serviceImpl;

import com.github.pagehelper.util.StringUtil;
import com.hamusuta.hellohamusuta.dao.ArticleMapper;
import com.hamusuta.hellohamusuta.model.Article;
import com.hamusuta.hellohamusuta.service.ArticleService;
import com.hamusuta.hellohamusuta.vo.requestVo.ArticleVo;
import com.hamusuta.hellohamusuta.vo.responseVo.ArticleIndexVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public void insertArticle(ArticleVo articleVo) {
        Article article = formatArticle(articleVo);
        articleMapper.insertSelective(article);
    }

    @Override
    public List<ArticleIndexVo> getArticleIndex(Integer index) {
        return articleMapper.searchArtIndex(index);
    }

    @Override
    public List<ArticleIndexVo> getArticlePage(Integer typeId) {
        return articleMapper.searchArtPage(typeId);
    }

    @Override
    public Article getAtricleById(Integer id) {
        return articleMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ArticleIndexVo> getAtricleByKeyWord(String keyword) {
        return articleMapper.searchArtIndexByKeyWord(keyword);
    }

    //格式化文章对象
    private Article formatArticle(ArticleVo articleVo) {
        Article article = new Article();
        //预留位从rdis查询用户讯息
        article.setAuthorId(1);
        article.setTitle(articleVo.getTitle());
        article.setContent(articleVo.getContent());
        article.setCreateTime(new Date());
        article.setTypeId(articleVo.getTypeId());
        article.setPreface(articleVo.getPerface());
        if (StringUtil.isNotEmpty(articleVo.getMusic())) article.setMusic(articleVo.getMusic());
        if (StringUtil.isNotEmpty(articleVo.getPicture())) article.setPicture(articleVo.getPicture());
        return article;
    }
}
