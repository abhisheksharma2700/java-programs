package inputoutput;
import java.util.*;
public class SwapTwoNumbers
{
  public static void main(String[]args)
  { Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers for swapping");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
   System.out.println("you have entered the value of num1 =" +num1+ "and value of num2 =" +num2);

    /*int temp= num1;
    num1= num2;
    num2=temp; */
   
    num1=num1+num2;
    num2=num1-num2;
    num1=num1-num2;
 
   System.out.println("Now after Swapping them their new values are");
    
   System.out.println("value of number 1= "+num1);
   System.out.println("value of number 2= "+num2);
}
}   