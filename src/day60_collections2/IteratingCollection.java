package day60_collections2;
import java.util.*;
public class IteratingCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java"); list.add("js"); list.add("html");
        list.add("ruby"); list.add("python"); list.add("kotlin");

        //Print everything
        for (String str : list){
            System.out.println(str);
        }

        //Iterator
        Iterator<String> it = list.iterator();
        System.out.println(it.hasNext());//true
        System.out.println(it.next());//java
        System.out.println(it.next());//js





    }
}
