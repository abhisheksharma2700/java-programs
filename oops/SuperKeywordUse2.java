class SuperKeywordUse2 {
    void show(){
        System.out.println("super keyword can be used to invoke immediate parent class method");
    }
}
class Test extends SuperKeywordUse2{
    void show(){
        System.out.println("this will be call when we cannot use super keyword");
    }
    
    void display(){
      super.show(); 
      //show();
    }
    public static void main(String[]args){
        Test t= new Test();
        t.display();
        
    }
}
