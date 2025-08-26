public class CustomException extends Exception {
    CustomException(String s){
        super(s);
    }
    
}
class main{
   public static void vote(int age) throws Exception{
        if(age<18){
            throw new CustomException("this is custom exception");

        }
        else{
            System.out.println("you cannot vote");
        }
    }
    public static void main(String[] args) {
        try {
            vote(14);
            
        } catch (Exception e) {
            System.out.println("exception caught  :"+e);
            
        }
        
        System.out.println("remaining code");
    }
}
