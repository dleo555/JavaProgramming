package day32_custom_methods;

public class CheckIfCanVote {
    public static void main(String[] args) {
        checkIfCanVote(2);//we can add scanner inside parenthesis
        printAge(2);
    }

    public static void checkIfCanVote (int age) {
        if (age >= 18){
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are no eligible to vote");
        }
    }

    public static void printAge (int age) {
        System.out.println("DOB " + (2019 - age));
    }
}
