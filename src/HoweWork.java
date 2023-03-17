import javax.swing.text.Style;
import java.awt.*;
import java.util.Scanner;

public class HoweWork {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of subject: ");
        int numberOfSubject = scanner.nextInt();


        int[] subjects = new int[numberOfSubject];
        for (int i = 0; i< subjects.length;i++){
            System.out.println("Input score : ");
            subjects [i] = scanner.nextInt();
        }

        int totalScore = 0;
        boolean isFailed = false;

        for (int i = 0; i < subjects.length; i++){
            if(subjects[i] < 50){
                System.out.println("You have fail ");
                isFailed=true;
                break;
            } else {
                isFailed= false;
                totalScore += subjects[i];
            }
            if (!isFailed){
                System.out.println("Your total score is : " );
            }
        }

    }
}
