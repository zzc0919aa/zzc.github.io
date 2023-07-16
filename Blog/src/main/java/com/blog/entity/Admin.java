package com.blog.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Admin implements Serializable {
    private Integer superId;
    private String superName;
    private String superPassword;
    private String phone;
    private String email;
    private Date date;

    public Admin() { }

    public Admin(Integer superId, String superName, String superPassword, String phone, String email, Date date) {
        this.superId = superId;
        this.superName = superName;
        this.superPassword = superPassword;
        this.phone = phone;
        this.email = email;
        this.date = date;
    }

    public Integer getSuperId() {
        return superId;
    }

    public void setSuperId(Integer superId) {
        this.superId = superId;
    }

    public String getSuperName() {
        return superName;
    }

    public void setSuperName(String superName) {
        this.superName = superName;
    }

    public String getSuperPassword() {
        return superPassword;
    }

    public void setSuperPassword(String superPassword) {
        this.superPassword = superPassword;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "superId=" + superId +
                ", superName='" + superName + '\'' +
                ", superPassword='" + superPassword + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return Objects.equals(superId, admin.superId) && Objects.equals(superName, admin.superName) && Objects.equals(superPassword, admin.superPassword) && Objects.equals(phone, admin.phone) && Objects.equals(email, admin.email) && Objects.equals(date, admin.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(superId, superName, superPassword, phone, email, date);
    }
}
