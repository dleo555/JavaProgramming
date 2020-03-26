package day17_while_do_while_loop;

public class switchWordsAndUpperCase {
    public static void main(String[] args) {
        String word = "Hello Friends";
        System.out.println(word.substring(6).toUpperCase()
                + " " + word.substring(0, 5).toUpperCase());

        //general approach
        System.out.println(word.substring(word.indexOf(' ') + 1).toUpperCase()
                + " " + word.substring(0, word.indexOf(' ')).toUpperCase());

    }
}
