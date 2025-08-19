public class PrintArray {
    public static void main(String[]args){
        int []arr= {1,2,3,4,5};
    
        for(int i=0;i<arr.length;i++){
    
                
            System.out.println("the elements in array at " + i+ " index is : "+  arr[i]);
        
            
            

        }
        // change an element in an array
        arr[2]=5;
        System.out.println(arr[2]);

        // declare an array and print it with different style
        int[] arr1= new int [5];
        arr1[0]=1;
        arr1[1]=2;
        arr1[2]=3;
        arr1[3]=4;
        arr1[4]=5;
        int n= arr1.length;
        for(int i= 0;i<n;i++){
            System.out.print(arr1[i]+ "  ");
        }

    }
}
