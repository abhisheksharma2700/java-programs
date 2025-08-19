public class Array1 {
    void show(){
    int [] arr={1,2,3,4,5};
    int n= arr.length;
     for(int i=0;i<n;i++){
        System.out.println(arr[i]+" ");
     }

    }
    public static void main(String[]args){
        Array1 array= new Array1();
        array.show();
    }

    
}
