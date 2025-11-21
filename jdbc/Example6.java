import java.sql.*;

public class Example6 {

    private static final String url="jdbc:mysql://localhost:3306/mydb";
    private static  final String username="root";
    private static final String password= "Abhishek2700@";
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection connection= DriverManager.getConnection(url,username,password);
            String query= "delete from student  where id=?";
            PreparedStatement preparedStatement= connection.prepareStatement(query);
            preparedStatement.setDouble(1,3);

            int rowsaffected=preparedStatement.executeUpdate();
            if(rowsaffected>0){
                System.out.println("data deleted successfully");
                //System.out.println(" data updated successfully !");
            }
            else{
                System.out.println("data not deleted");
                //System.out.println("data not updated ");
            }

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
