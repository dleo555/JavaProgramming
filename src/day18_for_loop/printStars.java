package day18_for_loop;

public class printStars {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i < 11; i++) {
            System.out.print("*");
            Thread.sleep(250);//to make sure the loop prints * one at a time
        }
    }
}
