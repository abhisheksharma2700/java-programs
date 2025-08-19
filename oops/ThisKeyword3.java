class Test {
    Test(){
        this(1);
        System.out.println("this is no arguments constructor");
    }
    Test(int a){
      // this();
        System.out.println("this is parameterized constructor");
    }
    public static void main(String[] args) {
        Test  t= new Test();
        
    }

    
}
