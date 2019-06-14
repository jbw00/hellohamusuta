package com.hamusuta.hellohamusuta.vo.responseVo;

public class ArticleIndexVo {

    private Integer id;

    private String title;

    private String preface;

    private String picture;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPreface() {
        return preface;
    }

    public void setPreface(String preface) {
        this.preface = preface;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "ArticleIndexVo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", preface='" + preface + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }
}
