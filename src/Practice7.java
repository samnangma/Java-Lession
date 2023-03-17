public class Practice7 {
    //Exercise : Write a code to create a function finding even number in a range of number

    public static void main(String[] args) {
        FindEvenNumber(10,20); ;
    }

    static void FindEvenNumber(int start , int end){
        for(int i =start ; i <= end; i++) {
            if(i %2 == 0) {
                System.out.println(i);
            }
        }
    }
}
