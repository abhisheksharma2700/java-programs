public class StaticMethod4 {
    static int i=10;
    static void show(){
    // System.out.println(this.i);
    System.out.println("a static method cannot refer to 'this' and 'super' keyword in anyway");
    }
    public static void main(String[] args) {
        StaticMethod4 s= new StaticMethod4();
        s.show();
    }
}
