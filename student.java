class StudentRecord{
    String name;
    int marks;

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
public class student {
   public static void main(String[] args) {
    StudentRecord s1 = new StudentRecord();
    s1.name = "Pawan";
    s1.marks = 90;

    s1.display();
   } 
}
