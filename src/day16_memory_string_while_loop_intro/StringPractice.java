package day16_memory_string_while_loop_intro;

public class StringPractice {
    public static void main(String[] args) {
        String word = "mom";
        String reversed = "";

        reversed = reversed + word.charAt(2) + word.charAt(1) + word.charAt(0);
        System.out.println("reversed: " + reversed);

        if (word.equals(reversed)){
            System.out.println("Palindrome 3 letter word");
        } else {
            System.out.println("Non-palindrome 3 letter word");
        }
    }
}
