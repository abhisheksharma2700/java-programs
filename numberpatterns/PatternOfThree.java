package numberpatterns;
import java.util.Scanner;

public class PatternOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of length");
        int length=sc.nextInt();
        sc.close();
        int mid=length/2;
        for(int i=1;i<=length;i++){
            System.out.print("*");

        }
        System.out.println();
        for(int j=1;j<=mid-1;j++){
            for(int i=1;i<=length-1;i++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for(int i=1;i<=length;i++){
            System.out.print("*");
        }
         System.out.println();
        for(int i=1;i<=mid-1;i++){
            for(int j=1;j<=length-1;j++){
            System.out.print(" ");

        }
             System.out.println("*");
        }
        for(int i=1;i<=length;i++){
            System.out.print("*");
        }
    }
}
