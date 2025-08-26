public class Exception2{
    public static void main(String[]args){
        String s= null;
        try{
        int length = s.length();
         System.out.println("length of string"+ length); 
        }
        catch(NullPointerException e){
            System.out.println("null variable can not be allowed "+e);
        }
        System.out.println("remaining of code...");
    }

}