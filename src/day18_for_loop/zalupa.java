package day18_for_loop;

public class zalupa {
    public static void main(String[] args) {
        int start = 25;
        int end = 20;

        if (start < end){ //12345
            for (int i = start; i <= end; i++) {
                System.out.println(i + " ");
            }
        } else if (end < start){ //54321
            for (int i = start; i >= end ; i--) {
                System.out.println(i + " ");
            }
        }
    }
}
