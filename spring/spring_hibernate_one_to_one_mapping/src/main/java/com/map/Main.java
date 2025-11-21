package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration cfg= new Configuration();
        cfg.configure("hibernate.xml");
        SessionFactory sessionFactory= cfg.buildSessionFactory();
        Question q1= new Question();
        q1.setQuestionId(1212);
        q1.setQuestion("what is java");

        Answer a1= new Answer();
        a1.setAnswerId(343);
        a1.setAnswer("java is a programing language");
        a1.setQuestion(q1);

        q1.setAnswer(a1);
        // second object
        Question q2= new Question();
        q2.setQuestionId(1213);
        q2.setQuestion("what is a program");

        Answer a2= new Answer();
        a2.setAnswerId(344);
        a2.setAnswer("a program is a set of instructions");
        a2.setQuestion(q2);

        q2.setAnswer(a2);

        // session
        Session session= sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();
        // save
        session.save(q1);
        session.save(q2);
        session.save(a1);
        session.save(a2);
        transaction.commit();

        //fetching
        Question q=(Question) session.get(Question.class,1213);
        System.out.println(q.getQuestion());
        System.out.println(q.getAnswer().getAnswer());



    }
}
