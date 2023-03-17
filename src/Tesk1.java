import java.awt.desktop.SystemEventListener;
import java.util.Arrays;
import java.util.Scanner;

public class Tesk1 {
    // Write a program "Compute Sum and Average of Array Elements"
    //Requirements(*)
    // Allow user to allocate the size of array
    // Allow user to input every element of array
    //Compute sum of array elements
    // print the result as below : Sum = 36, Average = 3.6


    public static void main(String [] args){
        System.out.println("Enter the required size of the array : ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] myArray = new int [size];
        int sum = 0;
        System.out.println("Enter the elements of the array one by one ");

        for (int i =0 ; i< size; i++){
            myArray[i]=s.nextInt();
            sum = sum + myArray[i];
        }

        double average = sum / size;

        System.out.println("Elements of the array are: "+Arrays.toString(myArray));
        System.out.println("Sum of the elements of the array :"+sum);
        System.out.format("The average is: %.3f", average);


        
    }





}
