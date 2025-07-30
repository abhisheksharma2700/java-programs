package inputoutput;
import java.util.*;
 public class PrimeNumber{
 public static void main(String[]args){
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter the number to cheack wheather it is prime or not");
 int number = sc.nextInt();
 boolean is_prime=true;
 int i=0;
 if(number<=1)
 System.out.println("is not prime");
 else
 {
   for(i=2;i<number/2;i++)
   {if( number %i ==0)
     is_prime= false;
      break;
    }
    }
   if (is_prime==true)
   { System.out.println("Number is prime");
    }
   else 
   System.out.println("Number is not prime");
 }
}