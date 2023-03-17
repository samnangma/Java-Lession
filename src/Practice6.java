import java.util.Arrays;

public class Practice6 {
    static int sum(int[] numbers){
        int sum = 0;
        int i;

        for (i = 0; i < numbers.length; i++)
            sum += numbers[i];

        return sum;
    }

    public static void main(String[] args) {
        int [] numbers ={1,2,3,4,5,6};

       System.out.println(sum(numbers));
    }
}
