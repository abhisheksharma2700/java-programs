import java.util.*;
public class TwoDArrayUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows ");
        int rows= sc.nextInt();
        System.out.println("enter the number of coloums");
        int coloum= sc.nextInt();
        int arr[][]= new int [rows][coloum];
        System.out.println("enter the elements in array");
        for(int i=0;i<rows;i++){
            for(int j=0;j<coloum;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("the elements in 2-D array are :");
        for(int i=0 ;i<rows;i++){
            for(int j=0;j<coloum;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
