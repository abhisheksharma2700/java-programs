public class StaticBlock2 {
    static int i;
    int j;
   StaticBlock2(int i){
    System.out.println("i am in constructor "+i);
   }
   
    static{
        i=100;
        System.out.println("Static block is executed before the constructor "+ i);
    }
}
class NewClass{
    public static void main(String[] args) {
        StaticBlock2 s= new StaticBlock2(10);

    }
}
