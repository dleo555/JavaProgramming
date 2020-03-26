package day17_while_do_while_loop;
import java.util.Scanner;
public class giveMe5Dollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int money = 0;
        while (money != 5){
            System.out.println("Give me 5 dollars");
            money = input.nextInt();
        }
    }
}