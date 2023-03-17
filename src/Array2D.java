import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        int[][] n = {
                {11, 22, 33, 44, 55},
                {10, 20, 30},
                {100, 400, 800, 300}
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the Value : ");

        int valueFromUser = scanner.nextInt();
        boolean isFound = false;

        int[][] numbers = new int[3][4];
        numbers[0][0] = 3;
        numbers[0][3] = 3;
        numbers[0][2] = 3;
//        numbers[0][3]=3;


        for (int row = 0; row < n.length; row++) {
            System.out.println("row= " + row);
            for (int column = 0; column < n[row].length; column++) {
                if (valueFromUser == n[row][column]) {
                    System.out.println("index : " + column);
                    isFound = true;
                    System.out.println("Input new value : ");
                    int newValue = scanner.nextInt();
                    n[row][column] = newValue;
//                    break;
//                System.out.println("i = " +row+ " || " + "j = "+ n[row][column]);
                    System.out.println("column = " + n[row][column]);
                    System.out.println("value =" + n[row][column]);
                    System.out.println("=======================");
                }
            }
        }
    }
}
