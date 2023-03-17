import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args) {


        String[] names = {"veansea", "limhai", "samnang", "buthong", "heng"};
        Scanner scanner = new Scanner(System.in);


        System.out.print("Input the value : ");
        String valueFromUser = scanner.next();
        boolean isFound = false;

        for (int i = 0; i < names.length; i++) {
            if (valueFromUser.compareTo(names[i]) == 0) {
                System.out.println("index : " + i);
                isFound = true;
                System.out.println("Input new value : ");
                String newValue = scanner.next();

                //update array for index
                names[i] = newValue;
                break;

            }
        }

        if (!isFound)
            System.out.print("There is no value to your input");
        for (String value : names) {
            System.out.println(value);
        }
    }
}

