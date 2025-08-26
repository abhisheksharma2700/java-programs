import java.util.*;
class Main extends Exception{

}


public class CustomException2 {
    public static void main(String[] args) {
        try{
            throw new Main();
        }
        catch(Main e){
            System.out.println("catched the exception");
            System.out.println(e.getMessage());

        }
    }
    
}
