class ThisKeyword5 {
    ThisKeyword5(Test t){
        System.out.println("this can be used to pass as a argumrnt in the method call");

    }
    static class Test  {
        
    void m1(){
        ThisKeyword5 t1= new ThisKeyword5(this);
        
        System.out.println("this is pass as a argument in the constructor");


    }
    
    public static void main(String[]args){

    Test t = new Test();
      
      t.m1();

    }
}


    
}
