package com.blog.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Comment implements Serializable {
    private Integer cid;
    private String content;
    private Date time;
    private Article article;
    private User user;

    public Comment() { }

    public Comment(Integer cid, String content, Date time, Article article, User user) {
        this.cid = cid;
        this.content = content;
        this.time = time;
        this.article = article;
        this.user = user;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
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

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "cid=" + cid +
                ", content='" + content + '\'' +
                ", time=" + time +
                ", article=" + article +
                ", user=" + user +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return Objects.equals(cid, comment.cid) && Objects.equals(content, comment.content) && Objects.equals(time, comment.time) && Objects.equals(article, comment.article) && Objects.equals(user, comment.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cid, content, time, article, user);
    }
}
