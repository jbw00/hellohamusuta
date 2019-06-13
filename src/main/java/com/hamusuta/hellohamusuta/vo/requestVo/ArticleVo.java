package com.hamusuta.hellohamusuta.vo.requestVo;

import io.swagger.annotations.ApiParam;

public class ArticleVo {

    @ApiParam(value = "标题",required = true)
    private String title;
    @ApiParam(value = "前言",required = true)
    private String perface;
    @ApiParam(value = "内容",required = true)
    private String content;
    @ApiParam(value = "类型",required = true)
    private Integer typeId;
    @ApiParam(value = "音乐链接",required = false)
    private String music;
    @ApiParam(value = "图片链接",required = false)
    private String picture;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPerface() {
        return perface;
    }

    public void setPerface(String perface) {
        this.perface = perface;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "ArticleVo{" +
                "title='" + title + '\'' +
                ", perface='" + perface + '\'' +
                ", content='" + content + '\'' +
                ", typeId=" + typeId +
                ", music='" + music + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }
}
