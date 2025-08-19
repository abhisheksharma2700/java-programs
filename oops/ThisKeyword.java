class Test  {
    int i;
    void value(int i){
        this.i= i;
    }
    void show(){
        System.out.println(i);
    }
}
class ThisKeyword{
    public static void main(String[] args) {
        Test t= new Test();
        
        t.value(10);
        t.show();
    }
}