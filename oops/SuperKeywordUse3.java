class A {
    A(){
    System.out.println("super keyword can be used to invoke immediate parent class constructor");
    }
}
class B extends A{
   B(){
    super();
    System.out.println("i am in class B");
    
    
   }


    public static void main(String[] args) {
        B b1 = new B();
        

    }
}

