//printing the table of a number input by a user
package inputoutput;
import java.util.*;
 public class TableOfANumber
 {
   public static void main(String[] args)
   {
     int i=0;
     int n=0;
     int product=0;
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a number to print a table: ");
    n = sc.nextInt();
    
    /* i=1;
    while(i<=10)
    { product=n*i;
      System.out.println(n+ "*" +i+ "="+product);
      i=i+1; 
      } 
     for(i=1;i<=10;i++)
     { product=i*n;
       System.out.println(n+"*"+i+"="+product);
      } */

     i=1;
     do
     { product=i*n;
       System.out.println(n+"*"+i+"="+product);
       i=i+1;
   }
     while(i<=10);
  }
 }