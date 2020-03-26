package day08_if_statement;
import java.util.Scanner;
public class ExamResult {
    public static void main(String[] args) {

        int passingScore = 60;
        int yourScore;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score");
        yourScore = input.nextInt();

        if (yourScore >= passingScore) {
            System.out.println("Congratulations! You passed the exam.");
        } else
            System.out.println("You failed.");
        }
    }
