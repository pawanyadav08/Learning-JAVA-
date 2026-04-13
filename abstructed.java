abstract class Vehicle{
    abstract void go(); //do not use body
}
class Car extends Vehicle{
    @Override
    void go(){
        System.out.println("The Driver is Driving a Car");
    }
}
public class abstructed {
    public static void main(String[] args) {
        // Vehicle vehicle = new Vehicle();
        Car car = new Car(); 
        car.go(); 
    }
}
