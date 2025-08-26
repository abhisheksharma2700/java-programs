public class ThrowKeyword {
    public static void vote(int age){
    
        if( age<18){
            throw new ArithmeticException("person is not able to vote");

        }
        else{
            System.out.println("a person can vote");
        }

        

    
    }
    public static void main(String[] args) {
        ThrowKeyword t= new ThrowKeyword();
        t.vote(13);
        t.vote(19);
        
    }
}
