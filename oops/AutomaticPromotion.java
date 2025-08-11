package oops;
class Test {
    void show(int a){
        System.out.println("this is an integer");
    }
    void show(String a){
        System.out.println("this is an string");
    }
    void show(int a, float b){
        System.out.println("this is integer and float");
    }
    void show(float a , int b){
        System.out.println("this  is float and integer");
    }
    void show(String a, float b){
        System.out.println("this is string and float");
    }
    
    void show(StringBuffer a){
        System.out.println("this is an string buffer");
    }
    void show(Object a){
        System.out.println("this is an object");
    }
    void show(int...a){
        System.out.println("this is an varargs ");
    }
}
public class AutomaticPromotion{
    public static void main(String[]args){
        Test t= new Test();
        t.show('a');// char data type automatically promoted to integer
        t.show("string");
        t.show(1, 2.5f);
        t.show(2.5f, 1);
       // t.show(2.5f,4.3f); this time compiler will confused and does not automatically promote
       t.show("abc",10); //this time compiler automatically promote int to float
       t.show(new StringBuffer("string"));
       t.show(t);
       t.show(1,2,3,4);
    }
}