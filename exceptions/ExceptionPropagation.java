public class ExceptionPropagation {
    
    void a(){
        int a= 50/0;
    }

    void b(){
        a();
    }


    void c(){
        try {
            b();
            
        } catch (Exception e) {
            System.out.println("exception handled");
        }

        
    }

}
class Main{
    public static void main(String[] args) {
        ExceptionPropagation e= new ExceptionPropagation();
        e.c();
        // cheacked exception don't propagated 
        
    }
}
