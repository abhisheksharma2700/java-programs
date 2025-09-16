import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
// batch data using statement only

public class Batchdata {
    private static final String url="jdbc:mysql://localhost:3306/mydb";
    private static final String username="root";
    private static final String password="Abhishek2700@";
    public static void main(String[] args)  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("class not found exception");
        }
        try {


            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("Enter the name");
                String name = sc.next();
                System.out.println("enter the age");
                int age = sc.nextInt();
                System.out.println("Enter the marks");
                double marks = sc.nextDouble();
                System.out.println("do you want to insert more data or not (Y/N)");
                String choice = sc.next();
                String query = String.format("insert into student(name,age,marks) values ('%s',%d,%f)", name, age, marks);
                statement.addBatch(query);
                if (choice.toUpperCase().equals("N")) {
                    break;
                }
            }
            int[] arr = statement.executeBatch();
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }


    }
}
