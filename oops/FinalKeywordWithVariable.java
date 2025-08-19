public class FinalKeywordWithVariable {
   
    final int i=  10;
    void show(){
        i= i+20;
        System.out.println(i);
    }
    public static void main(String[] args) {
        FinalKeywordWithVariable f= new FinalKeywordWithVariable();
        f.show();
    }

}
