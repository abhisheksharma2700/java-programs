package oops;
class A extends C{
    void showa(){
        System.out.println("Method of class A");
    }
}
class B extends C{
    void showb(){
        System.out.println("Method of class B");

    }
}
class C{
    void showc(){
        System.out.println("Method of class C");
    }
}
public class HiearchicalInheritance{
    public static void main(String[]args){
        A a1= new A();
        a1.showa();
        //a1.showb();
        a1.showc();
        B b= new B();
        //b.showa();
        b.showb();
        b.showc();
        C c= new C();
        //c.showa();
        //c.showb();
        c.showc();
    }
}