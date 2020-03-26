package day16_memory_string_while_loop_intro;

import java.sql.SQLOutput;

public class StringPool {
    public static void main(String[] args) {
        String word1 = "java";
        String word2 = "java";
        String word3 = new String("java");

        System.out.println(word1 == word2);//true (because inside STRING POOL)
        System.out.println(word1 == word3);//false (because outside STRING POOL)

        String word4 = new String ("java");
        System.out.println(word3 == word4);//false (even though both of them outside STRING POOL

        String word5 = word4;
        System.out.println(word5 == word4);//true
    }
}
