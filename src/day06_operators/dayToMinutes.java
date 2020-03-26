package day06_operators;
import java.util.Scanner;
public class dayToMinutes {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of days");
        long days = input.nextLong();
        long minutes = days *1440;
        System.out.println("Number of minutes: " +minutes);
        long seconds = minutes *60;
        System.out.println("Number of seconds: " +seconds);
    }
}
