package com.main;

import com.main.dao.UserDao;
import com.main.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringBootProject4JdbcCrudApplication implements CommandLineRunner {
    @Autowired
    private UserDao userDao;

    public static void main(String[] args) {
		SpringApplication.run(SpringBootProject4JdbcCrudApplication.class, args);
	}
    @Override
    public void run(String... args) throws Exception {
        String name,email,gender,city;
        int id;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the id");
        id=sc.nextInt();
        System.out.println("Enter the name");
        name=sc.next();
        System.out.println("enter the email address");
        email=sc.next();
        System.out.println("enter the gender");
        gender=sc.next();
        System.out.println("enter the city");
        city=sc.next();
        //User user1= new User("jack","jack@gmail.com","male","jaipur");

        // Insertion
        User user2= new User(id,name,email,gender,city);
        boolean status= userDao.insertUser(user2);
        if(status){
            System.out.println("user inserted successfully");
        }
        else{
            System.out.println("user not inserted due to some error");
        }


        // Updation
       /* User user= new User(id,name,email,gender,city);
        boolean status= userDao.updateUser(user);
        if(status){
            System.out.println("user updated successfully");
        }
        else{
            System.out.println("user not updated");
        }

        */

        // Deletion
       /*
        User user= new User();
       user.setId(id);
       userDao.deleteUser(id);

        */

//   Fetching data from database (for single user)
    /*
     User user = userDao.getUser(id);
        System.out.println("Id: "+user.getId());
        System.out.println("Name: "+user.getName());
        System.out.println("Email Id: "+user.getEmail());
        System.out.println("Gender: "+user.getGender());
        System.out.println("City: "+user.getCity());

     */
        // fetching data from database (for all user)
        /*
        List<User> userList= userDao.getAllUser();
        for (User user: userList){
            System.out.println("Id: "+user.getId());
            System.out.println("Name: "+user.getName());
            System.out.println("Email Id: "+user.getEmail());
            System.out.println("Gender: "+user.getGender());
            System.out.println("City: "+user.getCity());
            System.out.println("-------------");
        }

         */



    }








}
