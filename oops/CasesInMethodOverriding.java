package oops;
class Test {
    //String show(int a)
    protected  Object show(int a)
    {
          System.out.println("this is parent class of string");
          return null;
    }
    
}

public class CasesInMethodOverriding extends Test{
   // Obeject show(int a) 
   // protected  String show(int b)(it throws least  privilages access modifiers error)
    public  String show (int b)
    {   //super.show(3);
        System.out.println("this is child class of Object");
        return null;
    }
    public static void main(String[]args){
        Test t1 = new Test();
        CasesInMethodOverriding t2= new CasesInMethodOverriding();
        t1.show(4);
        t2.show(3);
      //  t2.show(4);
    }
}