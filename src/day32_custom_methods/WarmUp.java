package day32_custom_methods;

public class WarmUp {
    public static void main(String[] args) {
        int [] [] teamScores = {
                {1,2,3,4,5},
                {5,4,3,2,1},
                {8,9,3,4,5},
                {9,2,3,1,7}};
        int sum = 0;
        int max = 0;
        for (int i = 0; i < teamScores.length; i++) {
            for (int j = 0; j < teamScores[i].length; j++) {
                sum += teamScores [i] [j];
            }
            System.out.println("Sum for team " + (i + 1) + " " + sum );
            if (sum >= max){
                max = sum;
            }
            sum = 0;
        }
        System.out.println("Maximum sum is " + max);
    }
}