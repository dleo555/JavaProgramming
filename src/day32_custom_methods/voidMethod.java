package day32_custom_methods;

public class voidMethod {
    public static void main(String[] args) {
        countFrom1to10();
        iCanDoIt();
    }

    public static void countFrom1to10 (){
        System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9, 10");
    }

    public static void iCanDoIt (){
        for (int i = 0; i < 300; i++) {
            System.out.println("Java is fun - I can do it");
        }
    }
}
