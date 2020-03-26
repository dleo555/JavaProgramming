package day09_multibranch_switch;

public class SwitchCalculator {
    public static void main(String[] args) {
        char option = 'c';

        switch (option) {

            case 'A':
                System.out.println("Selected A");
                break;
            case 'B':
                System.out.println("Selected B");
                break;
            case 'C':
                System.out.println("Selected C");
                break;
            default:
                System.out.println("Go fuck yourself");
                break;
        }
    }
}
