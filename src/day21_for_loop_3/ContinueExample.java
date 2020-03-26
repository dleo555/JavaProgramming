package day21_for_loop_3;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
//2 -4 continue to next alteration
            if (i>=2 && i<=4){
                System.out.println("Skipping - " + i);
            }
            System.out.println("i = " + i);

        }
    }
}
