package basics;
import java.util.*;

     public class SumOfTwoVariables
     {
        public static void main(String[]args)
       {
          System.out.println("Enter the value of a and b for performing sum of them");
          Scanner sc= new Scanner(System.in);
          int a= sc.nextInt();
          int b= sc.nextInt();
          int sum= a+b;
          System.out.println("Sum of " + a + "and" + b + "is:"+sum);
        }
    }
          