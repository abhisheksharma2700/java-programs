package controlstatements;
import java.util.*;
 public class ButtonUsingSwitch
 {
   public static void main(String[] args)
   {
     Scanner sc= new Scanner(System.in);
     System.out.println("enter a button among 1,2,3");
     int a= sc.nextInt();
      
      switch(a)
       {
         case 1:
         System.out.println("you pressed button 1");
           break;
         case 2:
         System.out.println("you pressed button 2");
         break;
         case 3:
         System.out.println("you pressed button 3");
         break;
         default:
         System.out.println("Invalid button");
        }
      }
   }