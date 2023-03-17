package OOp;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("G7", 20000 , 2023,"Audi");

        System.out.println(car.getModel());

        Car car1 = new Car();
        car1.setModel("A5");
        System.out.println("Name"+car);
    }



}
