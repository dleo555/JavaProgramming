package day19_for_loop_2;

public class countHowMany {
    public static void main(String[] args) {
        int count = 0;
        char myChar = 'o';
        String str = "java loops are fun";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == myChar) {
                count++;
                System.out.println(myChar + " found at " + i);
            }
        }
        System.out.println("Count: " + count);
    }
}