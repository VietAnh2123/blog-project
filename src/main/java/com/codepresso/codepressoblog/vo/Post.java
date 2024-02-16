package com.codepresso.codepressoblog.vo;

import java.util.Date;

public class Post {
    private int id;
    private String title;
    private String content;
    private String username;
    private Date createAt;

    public Post(int id, String title, String content, String username, Date createAt) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.username = username;
        this.createAt = createAt;
    }

    public Post(int id, String title, String content, String username) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
