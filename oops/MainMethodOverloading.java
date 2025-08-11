package oops;
public class MainMethodOverloading {
    public static void main(String[] args) {
        System.out.println("this is the first main method");
        MainMethodOverloading m= new MainMethodOverloading();
        m.main(10);
    }
    public static void main(int a) {
        System.out.println("this is the second main method");
    }
}
