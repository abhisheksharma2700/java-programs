package controlstatements;
import java.util.*;
 public class ButtonUsingIfElse
 {
    public static void main(String[] args)
   {
      Scanner sc= new Scanner(System.in);
      System.out.println("enter a button between 1 to 3");
      int a= sc.nextInt();
     if(a==1)
    {
       System.out.println("You pressed button 1");
      }
     else if(a==2)
     System.out.println("You pressed button 2");
     else if(a==3)
      System.out.println("You pressed button 3");
     else
      System.out.println("Invalid button");
    }
  }