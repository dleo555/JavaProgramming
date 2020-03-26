package day12_ternary_string_manipulation;

public class ternaryOperator {
    public static void main(String[] args) {
        int num1 = 55;
        int num2 = 10;
//==========================================Code 1 = Code2
        int max = num1 > num2 ? num1 : num2;
        System.out.println(max);
//===========================================Code 2 THE SAME RESULT
        if (num1 > num2) {
            max = num1;
            System.out.println(max);
        } else {
            max = num2;
            System.out.println(max);
        }
        //---------------different ternary usage (from int to string)
        int score = 55;
        String result = (score >=60) ? "pass" : "fail";
        System.out.println("result = " + result);
    }
}