public class TryCatchFinally  {
    public static void main(String[] args) {
        String a= "hello";
        try{
        int b= Integer.parseInt(a);
        System.out.println("string hello"+b);
        }
      catch(NumberFormatException e){
        System.out.println("exception handling done"+e);

    }
    finally{
        System.out.println("finally block will always executed ");
    }
    System.out.println("remaining program");

}
}
