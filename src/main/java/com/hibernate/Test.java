package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        Book book1=new Book();
        book1.setId(1);
        book1.setName("Yayati");
        book1.setAuthor("V.S.Khandekar");
//        SessionFactory factory= new Configuration().configure().buildSessionFactory();
//        Session session=factory.getCurrentSession();
//        session.beginTransaction();
//        session.persist(book1);
//        session.getTransaction().commit();
//        session.close();
        Configuration config=new Configuration();
        config.configure();
        SessionFactory factory=config.buildSessionFactory();
        Session session=factory.openSession();
        session.beginTransaction();
        session.persist(book1);
        session.beginTransaction().commit();
        session.close();


    }
}
