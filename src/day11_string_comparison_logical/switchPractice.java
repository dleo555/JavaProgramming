package day11_string_comparison_logical;
import java.util.Scanner;
public class switchPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weather");
        String weather;
        weather = input.next();
//  DO NOT USE == WHEN YOU COMPARE STRING VARIABLE
        switch (weather) {
            case "sunny":
                System.out.println("Go to park");
                System.out.println("Code Java");
                break;
            case "hot":
                System.out.println("Go swimming");
                System.out.println("Code Java");
                break;
            case "windy":
                System.out.println("Fly a kite");
                System.out.println("Code Java");
                break;
            default:
                System.out.println("Code Java only");
        }

    }
}
