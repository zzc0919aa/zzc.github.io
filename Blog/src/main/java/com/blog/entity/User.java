package com.blog.entity;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    private Integer uid;
    private String uname;
    private String password;
    private String tel;
    private String email;

    public User() { }

    public User(Integer uid, String uname, String password, String tel, String email) {
        this.uid = uid;
        this.uname = uname;
        this.password = password;
        this.tel = tel;
        this.email = email;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", password='" + password + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(uid, user.uid) && Objects.equals(uname, user.uname) && Objects.equals(password, user.password) && Objects.equals(tel, user.tel) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, uname, password, tel, email);
    }
}
