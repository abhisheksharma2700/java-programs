public class StaticMethod3 {
    static void show(){
        display();
        System.out.println(":  ");
    }
   // void display()
   static void display()
    {
        System.out.println("a static method can call only other static methods and cannot call a non static method");
    }
    public static void main(String[] args) {
        StaticMethod3 s= new StaticMethod3();
        s.display();
        s.show();
    }
}
