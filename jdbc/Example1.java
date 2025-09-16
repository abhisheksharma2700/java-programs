import java.sql.*;

public class Example1 {
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
            String query= "select * from student";
            ResultSet resultset= statement.executeQuery(query);
            while(resultset.next()){
                int id = resultset.getInt("id");
                String name= resultset.getString("name");
                int age= resultset.getInt("age");
                double marks= resultset.getDouble("marks");
                //System.out.println("id: "+id+" name: "+name+" age: "+age+" marks: "+marks);
                System.out.println("id: "+id);
                System.out.println("name: "+name);
                System.out.println("age: "+age);
                System.out.println("marks: "+marks);
            }


        }
        catch(SQLException e){
            System.out.println("sql exception caught");
        }




    }
}
