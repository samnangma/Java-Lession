package SuperCar;

public class Car {
    String color = "White";
    public Car(){
        System.out.println("Car Class");
    }
    void parentMethod(){
        System.out.println("parent method");

    }
}
class Audi extends Car {
    String color = "Black";

    public Audi(){
        super();
        System.out.println("Audi Class");
    }
    public  void printColor(){
        System.out.println(this.color);
        super.parentMethod();
        System.out.println(super.color);
    }
}
