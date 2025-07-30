package inputoutput;
import java.util.*;
  public class SumOfNNumbers
  {
    public static void main(String[] args)
    { int sum=0;
      int n=0;
      int i=0;
      Scanner sc= new Scanner(System.in);
      System.out.println("enter a natural number for sum of all numbers untill the  input natural number");
       n= sc.nextInt();
      

       for(i=1;i<=n;i++)
       {  
         sum+=i;
     
         
         }
        System.out.println("the sum of natural numbers till" +n+ "is:" +sum);
      }
   }
      