public class Example2 extends Thread{
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("thread 1 is running");
        }
    }
}
class B2 extends Thread{
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("thread 2 is running");
        }
    }
}
class Main2{
    public static void main(String[] args) {
        Example2 t1= new Example2();
        B2 t2= new B2();

        t1.start();
        t2.start();
    }
}
