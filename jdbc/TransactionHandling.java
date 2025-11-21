import java.sql.*;
import java.util.Scanner;

public class TransactionHandling {
      private static final String url = "jdbc:mysql://localhost:3306/transactions";
      private static final String username = "root";
      private static final String password = "Abhishek2700@";

      public static void main(String[] args) {
          try {
              Class.forName("com.mysql.cj.jdbc.Driver");
          } catch (ClassNotFoundException e) {
              System.out.println(e.getMessage());
          }
          try {
              Connection connection = DriverManager.getConnection(url, username, password);
              String debit_query = "update accounts set balance = balance-? where account_number=?";
              String credit_query = "update accounts set balance=balance+? where account_number=?";
              PreparedStatement debit_preparestatement = connection.prepareStatement(debit_query);
              PreparedStatement credit_preparestatement = connection.prepareStatement(credit_query);
              Scanner sc = new Scanner(System.in);
              System.out.println("enter the amount");
              double amount= sc.nextDouble();
              debit_preparestatement.setDouble(1, amount);
              debit_preparestatement.setInt(2, 101);
              credit_preparestatement.setDouble(1, amount);
              credit_preparestatement.setInt(2, 102);

              if(issufficient(connection,101,amount)) {
                  int rowsaffected1 = debit_preparestatement.executeUpdate();
                  int rowsaffected2 = credit_preparestatement.executeUpdate();

                  System.out.println("transaction successful !!");


              }else{
                  System.out.println("transaction failed");
              }



          } catch (SQLException e) {
              System.out.println(e.getMessage());
          }
      }

      static boolean issufficient(Connection connection, int account_number, double amount) {
          String query = "select balance from accounts where account_number=?";
          try {
              PreparedStatement preparedStatement = connection.prepareStatement(query);
              preparedStatement.setInt(1, account_number);
              ResultSet resultSet = preparedStatement.executeQuery();
              if (resultSet.next()) {
                  double current_balance = resultSet.getDouble("balance");
                  if (amount < current_balance) {
                      return true;
                  } else {
                      return false;
                  }
              }

          } catch (SQLException e) {
              System.out.println(e.getMessage());
          }
          return false;


      }
  }

