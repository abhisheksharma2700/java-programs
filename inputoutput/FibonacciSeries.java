package inputoutput;
import java.util.*;
public class FibonacciSeries
 {
   public static void main(String[]args)
   { Scanner sc= new Scanner(System.in);
     System.out.println("Enter the number of term for making your fibonacci series");
     int n= sc.nextInt();
     int i=0;
    int first=0;
    int second=1;
    int next;
    System.out.println("The fibonacci series to the " +n+ "term is");
    for(i=1; i<n; i++)
   { System.out.print(first+" ");
     next=first+second;
     first= second;
     second=next;
  }
}
}
     