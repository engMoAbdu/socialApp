package com.mycompany.socialapp;

public class Replay {
    private int id;
    private String content;

    public Replay(){}

    public Replay(String content) {
        this.content = content;
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
}
