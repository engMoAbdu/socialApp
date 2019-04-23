package com.mycompany.socialapp;
//import java.util.HashSet;
//import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "Comment")
public class Comment {
    private int id;
    private String content;
    
    private User user;
    private Post post;
    //private Set<Replay> replays= new HashSet<Replay>(0);
    
    public Comment(){}

    public Comment(String content, User user, Post post) {
        this.content = content;
        this.user = user;
        this.post = post;
    }

 //************************ ID ************// 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Comment_id")
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
//************************ Content ************//
    @Column(name = "content", nullable = false, length=1000)
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    
///********************** Relation Many To One ***************//
    @ManyToOne(cascade = CascadeType.ALL)
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    
/////********************** Relation One To Many ***************//
//    @OneToMany(cascade = CascadeType.ALL)
//	@JoinTable(name = "Replay", joinColumns = { @JoinColumn(name = "Comment_id") }, 
//                           inverseJoinColumns = { @JoinColumn(name = "Replay_id") })
//    public Set<Replay> getReplays() {
//        return replays;
//    }
//
//    public void setReplays(Set<Replay> replays) {
//        this.replays = replays;
//    }

    ///********************** Relation Many To One ***************//
    @ManyToOne(cascade = CascadeType.ALL)
    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
    
}
