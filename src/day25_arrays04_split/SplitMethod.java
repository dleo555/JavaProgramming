package day25_arrays04_split;

import java.lang.reflect.Array;

public class SplitMethod {
    public static void main(String[] args) {
        String words = "java,ruby,python,c++";
        String [] wordsArray = words.split(",");

        System.out.println(wordsArray [0]);//java
        System.out.println(wordsArray [1]);//ruby
        System.out.println(wordsArray [2]);//python
        System.out.println(wordsArray [3]);//c++

  //--------------------------------------------------------------------------------------
        //find how many words in the sentence
        String sentence = "java is fun";
String [] word = sentence.split(" ");
        System.out.println("number of words " + word.length);
        //print everything in reverse order
        for (int i = word.length -1; i >= 0; i--) {
            System.out.print(word [i] + " ");
        }


    }
}
