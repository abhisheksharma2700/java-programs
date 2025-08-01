package numberpatterns;
import java.util.Scanner;

public class PatternOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int length= sc.nextInt();
        sc.close();
        for(int i =1;i<=length;i++){
            for(int j=1;j<=1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=length-2;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=length;i++){
           System.out.print("*");
        }
        System.out.println();
        for(int i=1;i<=length;i++){
            for(int j=1;j<=length-1;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }


    }
}
