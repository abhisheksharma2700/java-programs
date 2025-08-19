import java.util.*;
public class ForEach {
    public static void main(String[] args) {
        
    
    int array[]= new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the elements in array ");
    for(int i=1; i<array.length;i++){
        array[i]= sc.nextInt();
    }
    for(int i:array){
        System.out.println(i);

    }
    //lets find which element is maximum
    


}
}
