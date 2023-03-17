package Testset1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {
        Set<Integer> mySet = new TreeSet<>();

        mySet.add(13);
        mySet.add(56);
        mySet.add(96);
        mySet.add(45);
        mySet.add(5);

        mySet.remove(56);

        Iterator<Integer> itr = mySet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());

        }
    }
}
