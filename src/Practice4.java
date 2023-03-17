import java.util.Arrays;

public class Practice4 {

    static void sortArray (int[] numbers){
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;

                }
            }

        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void main(String[] args) {
        int[] numbers = {4, 8, 12, 45, 10, 1, 2};

        sortArray(numbers);

    }
}

