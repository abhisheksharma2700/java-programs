import java.sql.*;
// by using preparedstatement


public class Example5{
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
            //String query= ("insert into student (name,age,marks) values (?,?,?)");
            String query= ("select marks from student where id=?");
            PreparedStatement preparedStatement= connection.prepareStatement(query);
            preparedStatement.setInt(1,1);
            //preparedStatement.setString(1,"anil");
            //preparedStatement.setInt(2,25);
            //preparedStatement.setDouble(3,45.2);
            ResultSet resultSet= preparedStatement.executeQuery();
            if(resultSet.next()){
                double marks= resultSet.getDouble("marks");
                System.out.println("marks: "+marks);

            }
            else{
                System.out.println("marks not found");
            }

           // int rowsAffected= preparedStatement.executeUpdate();
            //if(rowsAffected>0){
            //    System.out.println("data insertion done by prepared statement");
            //}
            //else{
            //    System.out.println("data not inserted");
            //}


        }
        catch(SQLException e){
            System.out.println("sql exception caught");
        }




    }
}


