public class Example4 implements Runnable{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            }
            catch (Exception e){
                System.out.println("we catch interrupted exception");
            }
        }
    }
}
class B4 implements Runnable{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello ");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception is checked");
            }
        }
    }
}
class Main4{
    public static void main(String[] args) {
        Runnable t1= new Example4();
        Runnable t2= new B4();
        Thread thread1= new Thread(t1);
        Thread thread2= new Thread(t2);

        thread1.start();
        thread2.start();
    }
}
