public class Inheritance {
    void sound(){
        System.out.println("Inheritance can gives ability to use properties of parent class to his child classes");
    }

}
class Animal extends Inheritance {
void sound(){
    System.out.println("all animals makes sound");
}
}
class Dog extends Animal
{
    void sound(){
        System.out.println("dog barks");
    }

}
class Cat extends Animal{
    void sound(){
        System.out.println("cat mews");
    }
    public static void main(String[] args) {
        Inheritance i= new Inheritance();
        i.sound();
        i= new Animal();
        i.sound();
        i= new Dog();
        i.sound();
        Animal a= new Animal();
        a.sound();
        a= new Dog();
        a.sound();
        a= new Cat();
        a.sound();

    }
}
