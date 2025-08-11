package oops;
public class MethodOverloading {
    void test(Object a){
        System.out.println("this is first test method");
    }
    void test(String a){
        System.out.println("this is second test method");
    }
    public static void main(String[] args) {
        MethodOverloading m= new MethodOverloading();
        //m.test(10);
        m.test("test");
    }
    
}
