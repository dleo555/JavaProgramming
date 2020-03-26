package day35_wrapper_classes_and_methods;

import java.util.Arrays;

public class cooking {
    public static void main(String[] args) {
    System.out.println("~~~~ SCRAMBLED EGGS RECIPE ~~~~");
    add("oil", "eggs", "salt", "cheese");
    mix(10);
    fry(5);
    }
    public static void add (String... items) {
        System.out.println("Adding - " + Arrays.toString(items));
    }
    public static void mix (int seconds) {
        System.out.println("Mix for " + seconds + " seconds.");
    }
    public static void boil (int minutes) {
        System.out.println("Boil for " + minutes + " minutes.");
    }
    public static void fry (int minutes) {
        System.out.println("Fry for " + minutes + " minutes.");
    }
    public static void bake (int minutes) {
        System.out.println("Bake for " + minutes + " minutes.");
    }
}
