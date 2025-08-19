interface  Show {
    
    void show();
}
interface Display{
    void display();
}
class Test implements Show, Display{
   public  void show(){
        System.out.println("this is also an abstract method");
    }
    public void display(){
        System.out.println("this is 2nd abstract method");
    }
    public static void main (String[]args){
       // Test t1= new Test();
        //Test2 t2= new Test2();
        Test t3 = new Test();
        t3.show();
        t3.display();


    }
}
