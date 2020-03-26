package day39_list_practice_custom_classes;
import java.util.*;
public class ProductsCatalog {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList(Arrays.asList("iPhone 6s", "iPhone 6s Plus", "iPhone X",
                "MacBook Pro", "ThumbDrive", "Beats HeadPhones", "Mouse", "Charger", "iPad", "Dyson Vacuum",
                "TV", "Apple Watch"));
        ArrayList<Double> price = new ArrayList(Arrays.asList(449, 549, 1149, 1499.99, 39.99, 349.99, 79.99,
                39.99, 429, 399, 2199, 559));
        ArrayList<Double> monthlyPayments = new ArrayList(Arrays.asList(18.71, 22.88, 56.16, 79.49, 2.68, 15.12, 8.98,
                4.56, 18.31, 16.25, 89.49, 21.18));

        //TASK1. print all now, using for loop.
        for(int i = 0; i<items.size();i++){
            System.out.println((i+1) + ". ["+items.get(i)+" - "+price.get(i)+" - "+monthlyPayments.get(i)+"]");
        }
        //TASK2. find Dyson Vacuum
        int index=-1;
        String item="Dyson Vacuum";
        for (int s=0;s<items.size();s++){
            if (items.get(s).equalsIgnoreCase(item)) {
                index=s;
            }
        }
        if(index>-1){
            System.out.println(items.get(index)+" | "+price.get(index)+" | "+monthlyPayments.get(index));
        }else{
            System.out.println(item+" is not found! Keep coding java!");
        }
        //TASK 4. update price for a specific item
        String product = "TV";
        double newPrice = 1099.0; //old price 2199
        if (items.contains(product)) {
            int index1 = items.indexOf(product);
            price.set(index1, newPrice);
            System.out.println("Price changed successfully");
            System.out.println(items.get(index1) + " - " + price.get(index1));
        } else {
            System.out.println("Item not fount. Price cannot be changed.");
        }

        //TASK7.
        int priceLimit = 500;
        for (int i = 0; i < items.size(); i++) {
            if(price.get(i) < priceLimit){
                System.out.println("[" + items.get(i) + " - " + price.get(i) + " - " + monthlyPayments.get(i) + "]");
            }
        }

        // 8. find the most expensive item and print out  ( MacBook pro)
        int max = 0;
        for (int i = 0; i <price.size() ; i++) {
            if(price.get(i) > price.get(max)){
                max = i;
            }
        }
        System.out.println(items.get(max) + " - " + price.get(max) + " - " + monthlyPayments.get(max));
        System.out.println();

        // 9. find the least expensive item and print out  (charger)
        int min = 0;
        for (int i = 0; i <price.size() ; i++) {
            if(price.get(i) < price.get(min)){
                min = i;
            }
        }
        System.out.println(items.get(min) + " - " + price.get(min) + " - " + monthlyPayments.get(min));
        System.out.println();
    }
}
