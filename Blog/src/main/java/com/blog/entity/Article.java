package com.blog.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Article implements Serializable {
    private Integer aid;
    private String title;
    private String author;
    private String content;
    private Date time;
    private Integer type;

    public Article() { }

    public Article(Integer aid, String title, String author, String content, Date time, Integer type) {
        this.aid = aid;
        this.title = title;
        this.author = author;
        this.content = content;
        this.time = time;
        this.type = type;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Article{" +
                "aid=" + aid +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", time=" + time +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(aid, article.aid) && Objects.equals(title, article.title) && Objects.equals(author, article.author) && Objects.equals(content, article.content) && Objects.equals(time, article.time) && Objects.equals(type, article.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aid, title, author, content, time, type);
    }
}
