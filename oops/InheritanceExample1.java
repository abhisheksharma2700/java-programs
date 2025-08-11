package oops;
class bike {
    static void start(){
        System.out.println("bike is started");
    }
   static  void stop(){
        System.out.println("bike is stooped");
    }

    
}
class vechile extends  bike{
    static void average(){
        System.out.println("average of bike is not good ");
    }


}
public class InheritanceExample1{
    public static void main(String[]args){
        vechile b1  = new vechile();
        vechile.average();
        vechile.start();
        vechile.stop();

    }
}
