package day06_operators;
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        int students = 50;
        System.out.println(students);
        students = students + 50;
        System.out.println(students);
        students = students - 2;
        System.out.println(students);

        Scanner input = new Scanner(System.in);


        int hours, minutes, seconds;
        System.out.println("Hours");
        hours = input.nextInt();
        System.out.println("Minutes");
        minutes = input.nextInt();
        System.out.println("Seconds");
        seconds = input.nextInt();

        System.out.println(hours + ":" +  minutes + ":" +  seconds + " PM");


    }
}