package com.blog.entity;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("all")
public class Catelog implements Serializable {
    private Integer gid;
    private String gname;
    private String detail;
    private Integer type;

    public Catelog() { }

    public Catelog(Integer gid, String gname, String detail, Integer type) {
        this.gid = gid;
        this.gname = gname;
        this.detail = detail;
        this.type = type;
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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Catelog{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", detail='" + detail + '\'' +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Catelog catelog = (Catelog) o;
        return Objects.equals(gid, catelog.gid) && Objects.equals(gname, catelog.gname) && Objects.equals(detail, catelog.detail) && Objects.equals(type, catelog.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gid, gname, detail, type);
    }
}
