import javax.swing.text.StyledEditorKit;
import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//
//        int person, Name;
//        boolean status;
//        boolean isRegistered;
//
//        int speedLimit = 100;
//        System.out.printf(""+speedLimit);
//        speedLimit = 400;
//        System.out.printf(""+speedLimit);
//
//        boolean flag = true;
//        byte range;
//        range =124;
//
//        char letter = '\u0051';
//
//        short temperature;
//        temperature = 200;
//
//        int number = 14500;
//        long far = -42332200000L;
//
//        float decimalNumber = -42.3f;
//        double salary = 500.5;
//
//
//
//
//
//    }
    public static void main(String[] args) {
////            int a =12;
////        System.out.printf("a");
////        double price =5.2;
////        System.out.print(price);
////        String name ="Hello Java Class".toLowerCase();
////        System.out.println(name);
//
//        int a = 10;
//        int b = 2 ;
////        int multiplyResult = a* b;
////        int additionResult = a +b ;
////        int substractiveResult = a -b ;
////        int divisionResult = a /b ;
////
////        System.out.println(multiplyResult);
////        System.out.println(additionResult);
////        System.out.println(substractiveResult);
////        System.out.println(divisionResult);
//
//        a += b ;  // a= a+b
//        a -= b;  //  a= a-b;
//        a *= b;  //   a= a*b;
//        a /= b; //   a= a/b;
//
//        System.out.println(a /=b);

//        int [] n ={11,22,33,44,55};
//
//        int[] numbers = new int[3];

//        numbers[0] = 11;
//        numbers[1] =22;
//        numbers[2] =33;
//
//        numbers[3] =44;

//        System.out.println(n[4]);

        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int [3];
        // insert data of array
        for (int i =0 ; i< numbers.length; i++){
            System.out.println("Input value to index "+ i +": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Length of Array ="+ numbers.length);
        for(int i = 0 ; i< numbers.length; i++) {
            System.out.println(numbers[i]);
        }


        // for each

        for(int a : numbers){
            System.out.println(a);
        }



    }






}