package day21_for_loop_3;

public class printStars {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 10;

        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <=columns ; c++) {
                System.out.print("* ");
            }
            System.out.println();
            if (r %2 ==0){
            System.out.print(" ");}
        }

    }
}
