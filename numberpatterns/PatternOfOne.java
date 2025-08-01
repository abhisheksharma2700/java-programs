package numberpatterns;
import java.util.Scanner;

public class OnePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of  pattern");
        int length=sc.nextInt();
        sc.close();

        for(int i=1;i<=length;i++){
                System.out.println("*");
            }
            System.out.println();
        }
        
     }

