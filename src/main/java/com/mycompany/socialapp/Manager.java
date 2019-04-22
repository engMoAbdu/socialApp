/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.socialapp;

import java.util.HashSet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Mohammed Elsaeed
 */
public class Manager {
    
    public static void main(String args[]){
        SessionFactory sessionFactory ;
        sessionFactory = new Configuration().configure().buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        
        User user = new User("Ahmed");
        
        Post post1 = new Post("Hello");
        Post post2 = new Post("Hello again");
        Post post3 = new Post("Hello tany");
        
        Comment comment = new Comment("Bravo",user);
        Comment comment1= new Comment("hahvd",user);
        
        Replay replay =new Replay("okay");
        Replay replay1 =new Replay("Thanks");
        
        HashSet<Post> set = new HashSet<>();
        set.add(post1);
        set.add(post2);
        set.add(post3);
        
        HashSet<Comment> comments = new HashSet<>();
        comments.add(comment);
        comments.add(comment1);
        post1.setComments(comments);
        user.setPosts(set);
        
        HashSet<Replay> replays= new HashSet<>();
        replays.add(replay);
        replays.add(replay1);
        comment.setReplays(replays);
        
        Transaction tx = session.beginTransaction();
        session.save(user);
        //session.save(post);
        
        tx.commit();
        
    }
}
