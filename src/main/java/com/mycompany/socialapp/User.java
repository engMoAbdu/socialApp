/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.socialapp;

//import java.util.HashSet;
//import java.util.Set;
//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "UserAccount")
public class User {

    private int id;
    private String name;
    //Set<Post> posts= new HashSet<Post>(0);;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    
///**************** ID ****************//
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "User_ID")
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
///**************** Name ****************//
    @Column(name = "name",nullable = false,length = 30)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
/////********************** Relation One To Many ***************//
//    @OneToMany(cascade = CascadeType.ALL)
//	@JoinTable(name = "Post", joinColumns = { @JoinColumn(name = "User_ID") }, 
//                           inverseJoinColumns = { @JoinColumn(name = "Post_id") })
//    public Set<Post> getPosts() {
//        return posts;
//    }
//
//    public void setPosts(Set<Post> posts) {
//        this.posts = posts;
//    }
   
    
}
