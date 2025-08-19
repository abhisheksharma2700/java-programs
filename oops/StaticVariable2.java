public class StaticVariable2 {
    static int count= 0;
    StaticVariable2(){
        count++;
        System.out.println(count);
    }
    public static void main(String[]args){
        StaticVariable2 s= new StaticVariable2();
        StaticVariable2 s2= new StaticVariable2();
        StaticVariable2 s3= new StaticVariable2();
    }
}
