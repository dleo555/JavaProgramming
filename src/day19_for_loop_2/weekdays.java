package day19_for_loop_2;

public class weekdays {
    public static void main(String[] args) {
        for (int i = 1; i <= 7 ; i++) {
            if (i == 1) {
                System.out.println(i + ". Monday");
            } else if (i == 2) {
                System.out.println(i + ". Tuesday");
            } else if (i == 3) {
                System.out.println(i + ". Wednesday");
            } else if (i == 4) {
                System.out.println(i + ". Thursday");
            } else if (i == 5) {
                System.out.println(i + ". Friday");
            } else if (i == 6) {
                System.out.println(i + ". Saturday");
            } else if (i == 7) {
                System.out.println(i + ". Sunday");
            }
        }
     //===========================================================
        for (int b = 1; b <= 7; b++) {
            switch (b){
                case 1:
                    System.out.println(b + ". Monday");
                    break;
                case 2:
                    System.out.println(b + ". Tuesday");
                    break;
                case 3:
                    System.out.println(b + ". Wednesday");
                    break;
                case 4:
                    System.out.println(b + ". Thursday");
                    break;
                case 5:
                    System.out.println(b + ". Friday");
                    break;
                case 6:
                    System.out.println(b + ". Saturday");
                    break;
                case 7:
                    System.out.println(b + ". Sunday");
                    break;
            }
        }
    }
}