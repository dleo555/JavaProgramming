package day14_string_manipulation;

public class indexOf {
    public static void main(String[] args) {
        String word = "java";//0-1-2-3
        System.out.println(word.indexOf('v'));//2
        System.out.println(word.indexOf("av"));//1
        System.out.println(word.indexOf("dasasdaa"));//-1 (because cannot find it)
    }
}
