package numberpatterns;
import java.util.*;
public class ZeroPattern{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the lemgth");
        int length = sc.nextInt();
        for(int i=1;i<=length;i++){
            System.out.print("*");
        }
         System.out.println();
        for(int i=1;i<=length;i++){
            System.out.print("*");
            for(int j=1;j<=length-2;j++){
                System.out.print(" ");
                
            }
            System.out.println("*");

            
        }
        for(int i=1;i<=length;i++){
            System.out.print("*");
        }

    }
}