public class Exception6 {
    void show(){
     try{
        int a= 10;
        System.out.println(a);
    
    
        try{
            
            int b= a/0;
            System.out.println(b);

        }
    
    
    catch(ArithmeticException e){
        System.out.println("divide by zero not allowed"+e);
    }
}
    catch(Exception e){
        System.out.println("exception caught"+e);
    }
    System.out.println("remaining code");
}
public static void main(String[] args) {
    Exception6 e= new Exception6();
    e.show();

}
 


}
