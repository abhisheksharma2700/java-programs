package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Configuration cfg= new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory= cfg.buildSessionFactory();

        Question q1= new Question();
        q1.setQuestionId(1212);
        q1.setQuestion("what is java");

        Answer a1= new Answer();
        a1.setAnswerId(343);
        a1.setAnswer("java is a programing language");
        a1.setQuestion(q1);

        Answer a2= new Answer();
        a2.setAnswerId(344);
        a2.setAnswer("with the help of java we can create softwares");
        a2.setQuestion(q1);
        // second question
        Question q2= new Question();
        q2.setQuestionId(1213);
        q2.setQuestion("why we use programing language");

        Answer aa1= new Answer();
        aa1.setAnswerId(344);
        aa1.setAnswer("to communicate with the computer");
        aa1.setQuestion(q1);

        Answer aa2= new Answer();
        aa2.setAnswerId(344);
        aa2.setAnswer("with the help of programing languages we can create softwares");
        aa2.setQuestion(q2);

        List<Answer> list= new ArrayList<>();
        list.add(a1);
        list.add(a2);
        q1.setAnswer(list);






        // session
        Session session= sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();
        // save

        session.save(q1);
        session.save(a1);
        session.save(a2);
        //fetching
       /*
       Question fetch_data= (Question)session.get(Question.class,1212);

        System.out.println(fetch_data.getQuestion());
        for (Answer a: fetch_data.getAnswer()){
            System.out.println(a.getAnswer());

        }

        */


        transaction.commit();




    }
}

