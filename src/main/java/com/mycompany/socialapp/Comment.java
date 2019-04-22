package com.mycompany.socialapp;
import java.util.Set;
public class Comment {
    private int id;
    private String content;
    private User user;
    private Set replays;
    
    public Comment(){}

    public Comment(String content, User user) {
        this.content = content;
        this.user=user;
    }

    public Set getReplays() {
        return replays;
    }

    public void setReplays(Set replays) {
        this.replays = replays;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
