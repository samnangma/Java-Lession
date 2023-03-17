package AbstructClass;

public class Main {
    public static void main(String[] args) {
        Parallelogarm parallelogarm = new Parallelogarm();
        Square square = new Square();

        double resultA = parallelogarm.calculateArea(3.5,5);
        double resultP = parallelogarm.calculateArea(3.5,5);

        double squareA = square.calculateArea(5,8);
        double squareP = square.calculateArea(5,8);

        square.printResult(squareA, squareP);
        parallelogarm.printResult(resultA, resultP);
    }
}

class Parallelogarm extends Shape {
    @Override
    double calculateArea(double a, double b) {
        return a * b * a;
    }

    @Override
    double calculatePerimeter(double a, double b) {
        return (a + b) * 2/1.2;
    }
}

class Square extends Shape{

    @Override
    double calculateArea(double a, double b) {
        return a * b;
    }

    @Override
    double calculatePerimeter(double a, double b) {
        return (a+b)*2;
    }
}


abstract class Shape{
    void printResult(double area, double perimeter){
        System.out.println("This is the Area ="+ area);
        System.out.println("This is the Perimeter ="+ perimeter);
    }

    abstract double calculateArea(double a , double b);
    abstract double calculatePerimeter(double a , double b);
}
