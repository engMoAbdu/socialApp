/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.socialapp;

//import java.util.HashSet;
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
        
        Post post1 = new Post("Hello",user);
        Post post2 = new Post("Hello again",user);
        Post post3 = new Post("Hello tany",user);
        
        Comment comment = new Comment("Bravo",user,post1);
        Comment comment1= new Comment("hahvd",user,post1);
        
        Replay replay =new Replay("okay",comment);
        Replay replay1 =new Replay("Thanks",comment1);
        
        session.save(user);
        
        session.save(post1);
        session.save(post2);
        session.save(post3);
        
        session.save(comment);
        session.save(comment1);
        
        session.save(replay);
        session.save(replay1);

        Transaction tx = session.beginTransaction();
        
        tx.commit();
        
    }
}
