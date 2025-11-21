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
        cfg.configure();
        SessionFactory sessionFactory= cfg.buildSessionFactory();
        Emp e1= new Emp();
        Emp e2= new Emp();
        e1.setEid(1);
        e1.setName("ram");

        e2.setEid(2);
        e2.setName("shyam");

        Project p1= new Project();
        Project p2 = new Project();
        p1.setPid(101);
        p1.setProjectName("Library Mangement System");

        p2.setPid(102);
        p2.setProjectName("Chatbot");

        List<Emp> list1=new ArrayList<Emp>();
        List<Project>list2=new ArrayList<Project>();

        list1.add(e1);
        list1.add(e2);

        list2.add(p1);
        list2.add(p2);

        //
        e1.setProjects(list2);
        p2.setEmployees(list1);

        Session session= sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();
        session.save(e1);
        session.save(e2);
        session.save(p1);
        session.save(p2);

        transaction.commit();





    }
}
