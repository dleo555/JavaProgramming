package day27_arrays06;

import java.util.Arrays;

public class Encryption {
    public static void main(String[] args) {
        //0123456789..
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String encrypted ="zyxwvutsrqponmlkjihgfedcba";
        String letter = "a";
        //encrypt letter
        //find the index of letter 'a' in alphabet
        int idx = alphabet.indexOf(letter);//0
        //read character at same index from encrypted
        System.out.println(encrypted.charAt(idx));
        System.out.println(letter +" => " +encrypted.charAt(idx));
        //===============
        String word = "java";
        String encWord = "";
        //encrypt this. 4 letters in word. No Loop please!
        char first  = word.charAt(0);//j
        char second = word.charAt(1);//a
        char third  = word.charAt(2);//v
        char fourth = word.charAt(3);//a
        int i1 = alphabet.indexOf(first);//9
        int i2 = alphabet.indexOf(second);//0
        int i3 = alphabet.indexOf(third); //21
        int i4 = alphabet.indexOf(fourth);//0
        char encr1 = encrypted.charAt(i1);//q
        char encr2 = encrypted.charAt(i2);//z
        char encr3 = encrypted.charAt(i3);//e
        char encr4 = encrypted.charAt(i4);//z
        encWord = ""+encr1+encr2+encr3+encr4;
        System.out.println("word = " + word);
        System.out.println("encWord = " + encWord);
    }
}
