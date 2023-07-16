package com.blog.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Message implements Serializable {
    private Integer mid;
    private String content;
    private Date date;
    private User user;

    public Message() { }

    public Message(Integer mid, String content, Date date, User user) {
        this.mid = mid;
        this.content = content;
        this.date = date;
        this.user = user;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Message{" +
                "mid=" + mid +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", user=" + user +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(mid, message.mid) && Objects.equals(content, message.content) && Objects.equals(date, message.date) && Objects.equals(user, message.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mid, content, date, user);
    }
}
