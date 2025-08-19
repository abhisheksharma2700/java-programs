class SuperKeyword {
    int a= 10;

    
}
class Test extends SuperKeyword{
     int a= 20;
     void method(int a){
        System.out.println(super.a);
       // System.out.println(this.a);
        //System.out.println(a);
     }
     public static void main(String[]args){
        Test t= new Test();
        t.method(30);
     }
}
