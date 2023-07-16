package com.blog.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@SuppressWarnings("all")
public class Post implements Serializable {
    private Integer gid;
    private String gname;
    private String content;
    private String author;
    private Date time;
    private Admin admin;

    public Post() { }

    public Post(Integer gid, String gname, String content, String author, Date time, Admin admin) {
        this.gid = gid;
        this.gname = gname;
        this.content = content;
        this.author = author;
        this.time = time;
        this.admin = admin;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "Post{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", time=" + time +
                ", admin=" + admin +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(gid, post.gid) && Objects.equals(gname, post.gname) && Objects.equals(content, post.content) && Objects.equals(author, post.author) && Objects.equals(time, post.time) && Objects.equals(admin, post.admin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gid, gname, content, author, time, admin);
    }
}
