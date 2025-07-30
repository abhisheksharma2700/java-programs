package studentinput;
import java.util.Scanner;
 class StudentInput
  {
     public static void main(String[] args)
     {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter your name");
          String name = sc.next();
          
           System.out.print("Enter your roll no");
           int rollno= sc.nextInt();
           
           System.out.println("Enter your marks");
           float marks= sc.nextFloat();
         
           System.out.println("your data is recorded:");
           System.out.println("Hello: "+name+  "your roll no is: "+rollno+  "and your marks are :" +marks);
          }
  }