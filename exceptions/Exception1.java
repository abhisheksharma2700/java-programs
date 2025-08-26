public class Exception1{
    public static void main(String[]args){
        int dividend= 100;
        int divisor = 0;
        try{
          int result= dividend/divisor;
          System.out.println("result is "+ result);
        }
        catch(ArithmeticException e){
            System.out.println("divide by zero not allowed"+ e);
        }
        System.out.println("rest of the code");
    }
}