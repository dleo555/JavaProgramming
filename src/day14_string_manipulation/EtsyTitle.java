package day14_string_manipulation;

public class EtsyTitle {
    public static void main(String[] args) {
        String title = "Wooden spoon | Etsy";

        if (title.startsWith("Wooden spoon") && title.contains(" | ") && title.endsWith("Etsy")){
            System.out.println("Etsy is true");
        } else {
            System.out.println("Etsy is false");
        }
    }
}
