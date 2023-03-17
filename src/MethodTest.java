public class MethodTest {

//        void print (int a, String name, Practice2 practice) {
//            System.out.println("Hello World");
//        }

        void  print (String name){
            System.out.println(name);
        }
        int sum(int a, int b ){
            int sum = a +b ;
            return sum;
        }

        boolean isEmpty(String name){
            //logic
            return true;
        }

    public static void main(String[] args) {
        String name = " Koko ";
        MethodTest obj = new MethodTest();

        int a = obj.sum (3,5);
        System.out.println(a);
    }
}

