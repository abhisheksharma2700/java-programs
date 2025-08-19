public class StaticMethod2 {
   //int i=10;
   static int i=10;
    static void show(){
        
        System.out.println(i+"  a static method can access only static data.it cannot access non-static data(instance data)");
    }
    public static void main(String[]args){
        StaticMethod2 s= new StaticMethod2();
        s.show();
    }
}
