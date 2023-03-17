import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args){
        int [] numbers ={34,56,423,123,445,23};
        String [] names={"veansea","limhai","samnang","buthong","heng"};
        // 1.Input number (56) to update
        // 2.Input new number (89) to replace (56)
        // 3. Print all the numbers

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the value : ");
        int valueFromUser = scanner .nextInt();
        boolean isFound = false;

        for (int i = 0; i < numbers.length; i++) {
            if (valueFromUser == numbers[i]) {
                System.out.println("index : " + i);
                isFound = true;
                System.out.println("Input new value : ");
                int newValue = scanner.nextInt();

                //update array for index
                numbers[i] = newValue;
                break;

            }
        }

            if(!isFound)
                System.out.println("There is no value to your input");
            for (int value :numbers){
                System.out.println(value);
            }
        }
    }

