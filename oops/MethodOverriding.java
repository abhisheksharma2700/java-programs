package oops;
class Test{
    void show(int a){
        System.out.println("this is test class method");
    }
}
public class MethodOverriding  extends Test{
    void show(int a){
        System.out.println("this is exam class method");
    }
    public static void main(String[] args){
        Test t = new Test();
        t.show(4);
        MethodOverriding m= new MethodOverriding();
        m.show(4);
    }
}
