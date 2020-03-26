package day40_custom_classes;

public class Product {
    String title;
    double price;
    int rating;
    String seller;


    public static void main(String[] args) {
        //we can add main method in same class and create objects
        Product prod1 = new Product();
        //assign variables in the object
        prod1.title = "Wooden Spoon";
        prod1.price = 14.99;
        prod1.rating = 5;
        prod1.seller = "Mr. Memento";

        System.out.println("Prod1 object title " + prod1.title);
        System.out.println("Prod1 object price " + prod1.price);

    }
public void displayInfro(){
            System.out.println("--- Product Info ---");
            System.out.println("title " + title);
        }




}
