public class Practice8 {

    static void SayHi(int count){
//        System.out.println("Hi...");

        if(count <= 1)
            return;

//        sayHi(count - 1);
    }
    static int factorial (int number) {
        int result = 1;
        if (number >= 1) {
            result =number * factorial(number -1);
            return result;

        }
        return result;
    }
    public static void main(String[] args) {
//        sayHi(5);

        int result2 = factorial(5);
        System.out.println(result2);


    }
}
