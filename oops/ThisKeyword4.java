class Test  {
    void m1(Test t){
        System.out.println("this is pass as a argument in the constructor");


    }
    void m2(){
         m1(this);

    }
    public static void main(String[]args){

    
    Test t= new Test();
    t.m2();

    }
}

