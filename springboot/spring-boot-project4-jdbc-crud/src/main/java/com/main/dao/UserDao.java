package com.main.dao;

import com.main.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public boolean insertUser(User user){
        boolean status=false;
        try {
            String Insert_Sql_Query = "insert into users(name,email,gender,city) values(?,?,?,?)";
            int count=jdbcTemplate.update(Insert_Sql_Query, user.getName(), user.getEmail(), user.getGender(), user.getCity());
            if(count>0){
                status=true;
            }
            else{
                status=false;
            }
        } catch (Exception e) {
            status=false;
            e.printStackTrace();
        }
        return status;
    }
    public boolean updateUser(User user){
        boolean status=false;
        try {
            String Update_Sql_Query = "update users set name=?,gender=?,city=? ,email=? where id=? ";

            int count = jdbcTemplate.update(Update_Sql_Query, user.getName(), user.getGender(), user.getCity(), user.getEmail(),user.getId());
            if (count > 0) {
                status=true;

            }
            else {
                status=false;
            }
        } catch (Exception e) {
            status=false;
            e.printStackTrace();

        }
        return status;

    }
    public boolean deleteUser(int id){
        boolean status=false;
        try {
            String Delete_Sql_Query = "delete from users where id=?";
            int count = jdbcTemplate.update(Delete_Sql_Query, id);
            if (count > 0) {
                status = true;
                System.out.println("deletion success");
            } else {
                status = false;
                System.out.println("not deleted data");
            }
        } catch (Exception e) {
            status=false;
            e.printStackTrace();
        }
        return status;

    }
    public User getUser(int id) {

        try {

            String get_User_Query = "select * from users where id=?";
            return jdbcTemplate.queryForObject(get_User_Query, new UserRowMapper(), id);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }



    }
    public static final class UserRowMapper implements RowMapper<User>{
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user= new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setEmail(rs.getString("email"));
            user.setGender(rs.getString("gender"));
            user.setCity(rs.getString("city"));
            
            return user;
        }
    }
    public List<User> getAllUser(){
        List<User> userlist= new ArrayList<>();
        try{
            String Select_All_User_Query="select * from users";
            return jdbcTemplate.query(Select_All_User_Query, new UserRowMapper1());


        } catch (Exception e) {
            e.printStackTrace();
        }
        return userlist;

    }
    public static final class UserRowMapper1 implements RowMapper<User>{
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user= new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setEmail(rs.getString("email"));
            user.setGender(rs.getString("gender"));
            user.setCity(rs.getString("city"));

            return user;
        }
    }

}
