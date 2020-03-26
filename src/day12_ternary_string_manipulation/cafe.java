package day12_ternary_string_manipulation;

public class cafe {
    public static void main(String[] args) {
        String order = "food";
        String drink = "soda";
        String food = "soup";
        double price, totalPrice;
        //soda 1.99, coffee 4.99, water 1.55
        //sandwich 7.45, soup 6.33, salad 9.99

        if (order.equals("drink") && drink.equals("soda")) {
            System.out.println("price is $1.99");
        } else if (order.equals("drink") && food.equals("coffee")) {
            System.out.println("price is $4.99");
        } else if (order.equals("drink") && food.equals("water")) {
            System.out.println("price is $1.55");
        } else if (order.equals("food") && food.equals("soup")) {
            System.out.println("price is $6.33");
        } else if (order.equals("food") && food.equals("sandwich")) {
            System.out.println("price is $7.45");
        } else if (order.equals("food") && food.equals("salad")) {
            System.out.println("price is $9.99");
        } else {
            System.out.println("We don't sell it anymore! Go to McDonald's! ");
        }
    }
}
