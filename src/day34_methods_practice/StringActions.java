package day34_methods_practice;

public class StringActions {
    public static void main(String[] args) {
        wordCount("Java is funniest thing in the world");
    }

    public static int wordCount (String sentence) {
        if (sentence.length() == 0) {
            return 0;
        } else {
            String [] array = sentence.split(" ");
            System.out.println(array.length);
            return array.length;

        }

    }
}
