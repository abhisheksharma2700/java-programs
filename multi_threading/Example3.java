public class Example3 extends Thread{
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("thread 1 is running");
            try {
                Thread.sleep(30);
            }
             catch (Exception e){
                 System.out.println("we catch interrupted exception");
            }
        }
    }
}
class B3 extends Thread{
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("thread 2 ");
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception is checked");
            }
        }
    }
}
class Main3{
    public static void main(String[] args) {
        Example3 t1= new Example3();
        B3 t2= new B3();
        //t2.setPriority(Thread.MAX_PRIORITY); // by using this we can change the thread priority

        t1.start();
        t2.start();
    }
}
