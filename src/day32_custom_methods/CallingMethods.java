package day32_custom_methods;

public class CallingMethods {
    public static void main(String[] args) {
        voidMethod.countFrom1to10();
        voidMethod.iCanDoIt();
        displayUSFlag();
    }

    public static void displayUSFlag (){
        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }
    }
}
