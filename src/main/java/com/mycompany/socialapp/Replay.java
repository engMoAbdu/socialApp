package com.mycompany.socialapp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Replay")
public class Replay {
    private int id;
    private String content;
    
    private Comment comment;
    
    public Replay(){}

    public Replay(String content, Comment comment) {
        this.content = content;
        this.comment = comment;
    }

    
//******************** ID ************//
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Replay_id")
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
//**************** content**********///
    @Column(name = "content",nullable = false,length = 50)
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    ///********************** Relation Many To One ***************//
    @ManyToOne(cascade = CascadeType.ALL)
    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }
    
}
