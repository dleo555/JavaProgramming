package day21_for_loop_3;

public class multiplicationTableV2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Table for #" + i);
            for (int j = 1; j <= 10 ; j++) {
                int result = i * j;
                System.out.println(i + " x " + j + " = " + result);

            }
            System.out.println("--------------------------");
        }
    }
}
