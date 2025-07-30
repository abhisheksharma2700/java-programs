package inputoutput;
import java.util.*;
 public class PalindromeNumber
  {
    public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number to cheack if it is palindrome or not");
    int number = sc.nextInt();
    int remainder,reverse=0;
    int original_number= number;
    while(number!=0)
    {
       remainder= number%10;
       reverse= reverse*10+remainder;
       number= number/10;
    }
     

      if(reverse==original_number)
     {
        System.out.println("Number is palindrome");
       }
      else
      { System.out.println("Number is not palindrome");
       }
   
 }
}