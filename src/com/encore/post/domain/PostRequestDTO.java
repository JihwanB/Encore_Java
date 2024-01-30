package com.encore.post.domain;

public class PostRequestDTO {
    private String id;
    private String title;
    private String content;
    private int views;
    private boolean isPrivate;

    public PostRequestDTO() {

    }

    public PostRequestDTO(String id) {
        this.id = id;
    }

    public PostRequestDTO(String id, String title, String content, int views, boolean isPrivate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.views = views;
        this.isPrivate = isPrivate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }
}
