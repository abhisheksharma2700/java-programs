import java.sql.*;

public class Example2 {
    private static final String url="jdbc:mysql://localhost:3306/mydb";
    private static final String username="root";
    private static final String password="Abhishek2700@";
    public static void main(String[]args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            System.out.println("class not found exception caught");

        }
        try{
            Connection connection= DriverManager.getConnection(url,username,password);
            Statement statement= connection.createStatement();
            String query= String.format("insert into student(name,age,marks) values ('%s',%o,%f)","aman",23,78.4);
            int rowsAffected= statement.executeUpdate(query);
            if(rowsAffected>0){
                System.out.println("data insertion done");
            }
            else{
                System.out.println("data not inserted");
            }


        }
        catch(SQLException e){
            System.out.println("sql exception caught");
        }




    }
}
