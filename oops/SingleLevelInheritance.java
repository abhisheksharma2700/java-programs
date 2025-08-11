package oops;
public class SingleLevelInheritance {
    void a(){
        System.out.println("method of class a");

    }

    public static void main(String[] args) {
        SingleLevelInheritance a1 = new SingleLevelInheritance();
        a1.a();
        //a1.b();
        OneLevelInheritence b1 = new OneLevelInheritence();
        b1.a();
        b1.b();
    }}
    class OneLevelInheritence extends SingleLevelInheritance{
    void b(){
        System.out.println("method of class B");
    }
    }




