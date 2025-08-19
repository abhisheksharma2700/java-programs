import java.util.Scanner;

public class FirstArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int number= sc.nextInt();
        int size[]= new int[number];
        System.out.println("Enter the elements of array");
        
        for(int i=0; i<number;i++){
            size[i]= sc.nextInt();
        }
        System.out.println("the elements in an array are");
        for(int i=0;i<number;i++){
            System.out.print(size[i]+" ");
        }
    }
}