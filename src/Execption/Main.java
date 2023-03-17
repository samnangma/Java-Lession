package Execption;

public class Main {
    public static void main(String[] args) {
        try {
            Student student = new Student("Samnang",10);
            System.out.println("Student score = " + student.getScore());
        } catch (ScoreFormatExecption e) {
//            throw new RuntimeException(e.getMessage());
            System.out.println(e.getMessage());
        }
    }
}
