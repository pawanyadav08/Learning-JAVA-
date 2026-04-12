class Animal{
    void speak(){
        System.out.println("The Animal speaks");
    }
}
class Dog extends Animal{

    @Override
    void speak(){
        System.out.println("The dog goes *bark*");
    }
}
public class methodOverinding {
   public static void main(String[] args) {
    Animal animal = new Animal();
    Dog dog = new Dog();
    dog.speak();
   } 
}
