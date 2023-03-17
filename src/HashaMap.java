import java.util.HashMap;
import java.util.Map;

public class HashaMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Samnang");
        map.put(2,"Nara");
        map.put(3,"Dara");
        map.put(4,"Vattana");
        map.put(5,"LOL");

        map.replace(2, "Hashaaa");
        for (Map.Entry<Integer, String>m: map.entrySet()){
            System.out.println("Key = "+ m.getKey()+ " :: value = "+m.getValue());
        }
        System.out.println(map.get(4));
    }
}
