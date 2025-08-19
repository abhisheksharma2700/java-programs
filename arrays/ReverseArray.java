
import java.util.*;

public class ReverseArray {
    void reverse(int n[]){
        //int arr[]=  n;
        int last= n.length;
        for(int i=last-1; i>=0;i--){
            System.out.println(n[i]);
        }


    }
    public static void main(String[] args) {
        ReverseArray r= new ReverseArray();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the elements of array");
        int array[]= new int[5];
        for(int i= 0; i<array.length;i++){
           array[i]= sc.nextInt();
           
        }
        sc.close();

        //int array[]={1,2,3,4,5};
        System.out.println("reversed array");
        r.reverse( array);
    }
}
