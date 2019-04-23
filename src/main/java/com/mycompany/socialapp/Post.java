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
@Table(name = "Post")
public class Post {
    
    private int id;
    
    private String content;
    
    private User user;
    
    //private Set<Comment> comments= new HashSet<Comment>(0);
    public Post() {}

    public Post(String content, User user) {
        this.content = content;
        this.user = user;
    }
    
    //************************ ID ************//
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Post_id")
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

    
//************************ Relation One To many ************//
//    @OneToMany(cascade = CascadeType.ALL)
//	@JoinTable(name = "Comment", joinColumns = { @JoinColumn(name = "Post_id") }, 
//                           inverseJoinColumns = { @JoinColumn(name = "Comment_id") })
//    public Set<Comment> getComments() {
//        return comments;
//    }
//
//    public void setComments(Set<Comment> comments) {
//        this.comments = comments;
//    }  
}
