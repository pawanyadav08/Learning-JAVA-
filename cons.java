class Human {
    String name;
    int age;
    double weight;
   Human(String name, int age , double weight){
    this.name = name;
    this.age = age;
    this.weight = weight;
   } 
}
public class cons{
    public static void main(String[] args) {
        Human human1 = new Human("Rick",65,78);
        Human human2 = new Human("Pawam",20,70);

        System.out.println("Name is "+human1.name);
        System.out.println("Age is "+human1.age);
        System.out.println("Weight is"+human1.weight);

        System.out.println("Name is "+human2.name);
        System.out.println("Age is "+human2.age);
        System.out.println("Weight is"+human2.weight);

    }
}