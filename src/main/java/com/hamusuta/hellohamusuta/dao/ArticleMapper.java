package com.hamusuta.hellohamusuta.dao;

import com.hamusuta.hellohamusuta.model.Article;
import com.hamusuta.hellohamusuta.model.ArticleExample;
import java.util.List;

import com.hamusuta.hellohamusuta.vo.responseVo.ArticleIndexVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleMapper {
    long countByExample(ArticleExample example);

    int deleteByExample(ArticleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Article record);

    int insertSelective(Article record);

    List<Article> selectByExampleWithBLOBs(ArticleExample example);

    List<Article> selectByExample(ArticleExample example);

    Article selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Article record, @Param("example") ArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") Article record, @Param("example") ArticleExample example);

    int updateByExample(@Param("record") Article record, @Param("example") ArticleExample example);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);

    List<ArticleIndexVo> searchArtIndex(@Param("index") Integer index);

    List<ArticleIndexVo> searchArtPage(@Param("typeId") Integer typeId);

    List<ArticleIndexVo> searchArtIndexByKeyWord(@Param("keyword") String keyword);
}