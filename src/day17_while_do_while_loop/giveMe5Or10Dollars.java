package day17_while_do_while_loop;
import java.util.Scanner;
public class giveMe5Or10Dollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;

        while (num !=5 && num !=10){ // we cannot use || because condition (num != 5 || num !=10) is always true
            System.out.println("Give me 5 or 10 dollars");
            num = input.nextInt();
        }
    }
}
