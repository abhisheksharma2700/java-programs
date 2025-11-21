package com.dz.main;
import com.dz.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {
        //User user1= new User();

       /* user1.setName("jack");
        user1.setEmail("jack@gmail.com");
        user1.setPassword("jiya");
        user1.setGender("male");
        user1.setCity("jaipur");

        */
        User user2= new User();
        user2.setName("jack");
        user2.setEmail("jack@gmail.com");
        user2.setPassword("jiya");
        user2.setGender("male");
        user2.setCity("delhi");

        Configuration cfg= new Configuration();

        cfg.configure("/Hibernate.cfg.xml");

        SessionFactory sessionFactory= cfg.buildSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

       // insert data into database
       try {
            session.save(user2);
            transaction.commit();
            System.out.println("user details successfully added into database");
        }catch (Exception e){
            transaction.rollback();
            e.printStackTrace();
            System.out.println("user details not added");

        }



        /*
        // select data from database
        try{
           User user= session.get(User.class,4l);
           if(user!=null) {
               System.out.println(user2.getId());
               System.out.println(user2.getName());
               System.out.println(user2.getGender());
               System.out.println(user2.getEmail());
               System.out.println(user2.getCity());
               System.out.println(user2.getPassword());
           }else {
               System.out.println("user not found or details can't be null");
           }

        } catch (Exception e) {
            e.printStackTrace();
        }

         */

        // update
        /*try {
            user2= session.get(User.class, 4l);
            user2.setCity("mumbai");
            session.saveOrUpdate(user2);

            transaction.commit();
            System.out.println("user details successfully updated");
        }catch (Exception e){
            transaction.rollback();
            e.printStackTrace();
            System.out.println("user details not updated");

        }

         */

        // delete
       /* try {

            user2.setId(1);
            session.delete(user2);

            transaction.commit();
            System.out.println("user details successfully deleted");
        }catch (Exception e){
            transaction.rollback();
            e.printStackTrace();
            System.out.println("user details not deleted");

        }

        */








    }
}
