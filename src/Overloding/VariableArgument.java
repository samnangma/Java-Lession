package Overloding;

public class VariableArgument {
    public static void main(String[] args) {
        Adders.add(10,50,30,40,60);
    }
}
class Adders{
    static void add( int... b){
        for(int value:b){
            System.out.println(value);
        }
    }

}
