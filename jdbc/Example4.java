import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Example4{
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
            String query= ("delete from student where id=2");
            int rowsAffected= statement.executeUpdate(query);
            if(rowsAffected>0){
                System.out.println("data deletion done");
            }
            else{
                System.out.println("data not deleted");
            }


        }
        catch(SQLException e){
            System.out.println("sql exception caught");
        }




    }
}

