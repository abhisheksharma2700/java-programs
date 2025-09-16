public class Example1 extends Thread{
   public void run(){
        System.out.println("thread 1 is running");
    }
}
class B extends Thread{
    public void run(){
        System.out.println("thread 2 is running");
    }
}
class Main{
    public static void main(String[] args) {
        Example1 t1= new Example1();
        B t2= new B();
        t1.run();
        t2.run();
    }
}
