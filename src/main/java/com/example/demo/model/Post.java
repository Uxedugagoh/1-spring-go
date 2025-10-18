package com.example.demo.model;

import java.util.Date;

public class Post {
    private final String text;
    private Integer likes;
    private final Date creationDate;
    private final Long id;

    public Post(Long id, String text, Date creationDate) {
        this.text = text;
        this.creationDate = creationDate;
        this.id = id;
        this.setLikes(0);
    }

    public String getText() {
        return text;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Long getId() {
        return id;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

}
