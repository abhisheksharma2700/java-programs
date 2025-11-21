import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Example3{
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
            String query= String.format("Update student set age= %d Where name='%s'",19,"aman");
            int rowsAffected= statement.executeUpdate(query);
            if(rowsAffected>0){
                System.out.println("data updated done");
            }
            else{
                System.out.println("data not updated");
            }


        }
        catch(SQLException e){
            System.out.println("sql exception caught");
        }




    }
}
