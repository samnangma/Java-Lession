package Execption;

public class Testthrow {
    void calculate(double a, double b){
        if (b == 0) {
            throw new ArithmeticException();
        }
        double result = a / b ;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Testthrow testthrow = new Testthrow();
        try {
            testthrow.calculate(30,5);
        } catch (ArithmeticException e){
            System.out.println("B can not equal to Zero ");
        }
    }


}
