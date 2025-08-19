

class Test {
    void show(){
        System.out.println("this is test method");
    }
    void display(){
      show();// if we don't use here this keyword compiler automatically done it.
    }
    public static void main(String[] args) {
        Test t= new Test();
       // t.show();
        t.display();
    }
}
