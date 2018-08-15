package com.lsq.dao;

public class LearnResouce {
    private String author;
    private String resname;
    private String resurl;

    public LearnResouce(String author, String resname, String resurl) {
        this.author = author;
        this.resname = resname;
        this.resurl = resurl;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getResname() {
        return resname;
    }

    public void setResname(String resname) {
        this.resname = resname;
    }

    public String getResurl() {
        return resurl;
    }

    public void setResurl(String resurl) {
        this.resurl = resurl;
    }

    @Override
    public String toString() {
        return "LearnResouce{" +
                "author='" + author + '\'' +
                ", resname='" + resname + '\'' +
                ", resurl='" + resurl + '\'' +
                '}';
    }
}
