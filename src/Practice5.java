import java.util.Arrays;

public class Practice5 {
//    public static void main(String[] args) {
//        int[] numbers = {4, 8, 12, 45, 10, 1, 2};
//
//        int min = Arrays.stream(numbers).min().getAsInt();
//        int max = Arrays.stream(numbers).max().getAsInt();
//
//        System.out.println("Min = " + min);
//        System.out.println("Max = " + max);
//    }

    public static void main(String[] args) {

        int[] numbers = {4, 8, 12, 45, 10, 1, 2};
        int max, min;

        min = max = numbers[0];

        for(int i = 1; i < numbers.length; ++i) {
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }
        System.out.println("The min is "+min);
        System.out.println("The min is "+max);
        

    }

}
