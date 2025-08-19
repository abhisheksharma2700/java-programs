//package oops;
 abstract class Vehicle {
    int no_of_tyres;
    abstract void start();
    
}
class Car extends Vehicle{
    //@Override
    void start(){
        System.out.println("Starts with key");
    }
}
class Bike extends Vehicle{
   // @Override
    void start(){
        System.out.println("Starts with kick");
    }
    public static void main(String[] args){
       //Car c= new Car();
        //Bike b= new Bike();
        Vehicle v= new Car();
        v.start();
       // c.start();
        //b.start();
    }
}
