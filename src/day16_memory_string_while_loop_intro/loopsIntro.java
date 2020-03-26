package day16_memory_string_while_loop_intro;

public class loopsIntro {
    public static void main(String[] args) {
//1222222222222222222222222222333333333333333344444444444444444444555555
        int num = 1;
        do {
            System.out.println("Hello world---->");
            num++;
        } while (num <= 3);
//=====================================================================
        int i = 0;
        for (i = 0; i < 3; i++)
            System.out.println("Hello World");
//++++++++++=====================+++++++++++++??????????????????????????
        int num1 = 0;
        while (num1 < 3) {
            System.out.println("Hello World!!!!!!");
            num1 ++;
        }
//3242432545656765876867655677777777777777777777777777777777777777777777777777777
    int steps = 1;
        while (steps <= 100) {
            System.out.println("Taking a step " + steps);
            steps++;
        }
    }
}