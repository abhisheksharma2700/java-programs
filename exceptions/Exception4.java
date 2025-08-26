public class Exception4 {
    public static void main(String[]args){
        int arr[]= {1,2,3,4,5};
        try{
        
        for(int i=0 ; i<=5;i++){
            System.out.println(arr[i]);
        }
        
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("array index is out of bound: "+e);

    }
    System.out.println("remaining code");
    }
    
}
