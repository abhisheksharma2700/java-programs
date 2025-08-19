class ThisKeyword6 {

     ThisKeyword6 m1() {
        return this;
    }
 
    public static void main(String[] args) {
        ThisKeyword6 k= new ThisKeyword6();
        k.m1();
    }
}
