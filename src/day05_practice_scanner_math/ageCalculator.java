package day05_practice_scanner_math;

public class ageCalculator {
    public static void  main(String [] args){
        //name, year of birth, current year, age
        String name = "Leo";
        int yearOfBirth = 1019;
        int currentYear = 2019;
        int age;
        age = currentYear - yearOfBirth;
        System.out.println("Leo's age is " + age + " years");
    }
}
