 class First {
    //final void show()
      void show()
    {
        System.out.println("this is class first");
    }
    
}
class Second extends First{
    void show(){
        System.out.println("this is class second");
    }
    public static void main(String[]args){
        Second s= new Second();
        s.show();
        First f= new First();
        f.show();
    }
}
