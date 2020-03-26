package day12_ternary_string_manipulation;
public class practice {
    public static void main(String[] args) {
/*
Nested If Statement ==> if (condition-1){if(condition-2){---A---}
else{---B---}} else{if(condition-3){---C---}else{---D---}}
 */
        String order, drink, food;
        order = "drink"; // drink or food
        drink = "coffee"; // soda, coffee or water
        food = ""; // sandwich, soup or salad
        double price = 0.00;
        if (order.equals("drink")) {
            if (drink.equals("soda")) {
                price = 1.99;
            } else if (drink.equals("coffee")) {
                price = 4.99;
            } else if (drink.equals("water")) {
                price = 1.55;
            }
        } else if (order.equals("food")) {
            if (food.equals("sandwich")) {
                price = 7.45;
            } else if (food.equals("soup")) {
                price = 6.33;
            } else if (food.equals("slad")) {
                price = 9.99;
            }
        } else {
            System.out.println("Sorry, Invalid order!");
        }
        System.out.println("Total Price: " + price);
    }
}


