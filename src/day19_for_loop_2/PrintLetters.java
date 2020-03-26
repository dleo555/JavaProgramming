package day19_for_loop_2;

public class PrintLetters {
    public static void main(String[] args) throws Exception {
        String name = "Leo";
        System.out.println(name.charAt(0));//L
        System.out.println(name.charAt(1));//e
        System.out.println(name.charAt(2));//o
        //====================================
        for (int i = 0; i < name.length(); i++) { // < is equal to <= length -1
            System.out.println(name.charAt(i));//Leo
            Thread.sleep(350);
        }
        for (int b = name.length() - 1; b >= 0; b--) {//oeL (reverse order)
            System.out.println(name.charAt(b));
        }
    }
}
