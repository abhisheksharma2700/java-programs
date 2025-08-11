package oops;
class A {
    void methoda(){
    System.out.println("Method of class A");
    
}
}
class B extends   A{
    void methodb(){
        System.out.println("Method of class B");
        
    }
}
class C extends  B{
    void methodc(){
        System.out.println("Method of class C");
    }
}
public class MultiLevelInheritance{
    public static void main(String[]args){
        A a1= new A();
        a1.methoda();
        //a1.methodb();
        //a1.methodc();
        System.out.println("____________________");
        B b1= new  B();
        b1.methoda();
        b1.methodb();
        //b1.methodc();
        System.out.println("____________________");
         C c1= new  C();
        c1.methoda();
        c1.methodb();
        c1.methodc();
    }
}