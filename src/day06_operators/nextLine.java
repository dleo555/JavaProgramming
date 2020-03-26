package day06_operators;
import java.util.Scanner;
public class nextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //next vs nextLine
        System.out.println("What is your full name?");
        String fullName = input.nextLine(); //nextLine
        System.out.println(fullName + " is coding Java");
        System.out.println();
        System.out.println("What is your friend's full name?");
        String friendsFullName = input.next();//next
        System.out.println(friendsFullName + " is coding Java");
    }
}
