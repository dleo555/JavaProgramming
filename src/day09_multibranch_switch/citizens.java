package day09_multibranch_switch;

public class citizens {
    public static void main(String[] args) {
        String citizenType = "sfdsxsdfdsfsdfsd";
        int age = 67;

        if (age >= 65)
            citizenType = "Senior";
        else
            citizenType = "Young";
        System.out.println("You are: " + citizenType);
    }
}
