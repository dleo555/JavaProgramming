package day37_arrayList;
import java.util.*;
public class ArrayListMethods2 {
    public static void main(String[] args) {
     ArrayList <String> shoppingList = new ArrayList<>();
        System.out.println("isEmpty() - " + shoppingList.isEmpty());
        System.out.println("size() == 0 - " + (shoppingList.size() ==0));

        int count = shoppingList.size();
        System.out.println("Count of items to buy - " + count);
        shoppingList.add("Jacket");
        //check of "Jacket" is among the items
        if (shoppingList.contains("Jacket")){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.println(
        );
        System.out.println(shoppingList);
        shoppingList.clear();
        System.out.println(shoppingList);

    }
}
