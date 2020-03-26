package day61_collections3;
import java.util.*;
public class HashMapDemo {
    public static void main(String[] args) {
        //    K         V
        Map<String, Double> map = new HashMap<>();
        map.put("potato", 3.99);
        map.put("eggs", 4.99);

        System.out.println(map.toString());

        System.out.println(map.get("eggs"));

    }
}
