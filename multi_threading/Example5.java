public class Example5 {

    int count;
// here if i am using synchronized then it make sure that only one thread complete process at one time
    public synchronized void increment() {
        count++;
    }
}
class Demo{

    public static void main(String[] args) {
        Example5 e = new Example5();
        Runnable A = () ->
        {
            for (int i = 1; i <= 1000; i++) {
                e.increment();

            }

        };
        Runnable C = () -> {
            for (int i = 1; i <= 1000; i++) {
                e.increment();
            }
        };


        Thread t1 = new Thread(A);
        Thread t2 = new Thread(C);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
            System.out.println("catched");
        }
        System.out.println(e.count);

    }

}


