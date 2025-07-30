package inputoutput;
import java.util.*;
 public class ReverseNumber
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number for reverse of it");
    int number= sc.nextInt();
    int reverse=0,remainder;
    while(number!=0)
    {
      remainder= number%10;
      reverse= reverse*10+remainder;
      number= number/10;
    }
     System.out.println("Reverse number: " +reverse);
  }
 }