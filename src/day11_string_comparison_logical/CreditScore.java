package day11_string_comparison_logical;
import java.util.Scanner;
public class CreditScore {
    public static void main(String[] args) {
        int score = 777;
        Scanner input = new Scanner (System.in);
        score = input.nextInt();
            if (score>=750 && score <=850){
                System.out.println("Excellent");
            }else if (score >=700 && score <750) {
                System.out.println("Good");
            }else if (score >=650 && score <700) {
                System.out.println("Fair");
            }else if (score >=550 && score <650) {
                System.out.println("Poor");
            }else if (score >=0 && score <550) {
                System.out.println("Bad");
            }}}
