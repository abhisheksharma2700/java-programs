package pattern;
import java.util.*;
 public class HalfPyaramid
 {
   public static void main(String[]args)
   {
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the numbers of rows ,you want in half pyaramid");
     int number= sc.nextInt();
     int i,j;
     for(i=1;i<=number;i++)
     {
       for (j=1; j<=i; j++)
       {
         System.out.print("*");
        }
        System.out.println();
        }
     
  }
 }
