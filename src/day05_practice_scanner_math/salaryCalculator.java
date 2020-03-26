package day05_practice_scanner_math;
import java.util.Scanner;
public class salaryCalculator {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter hourly rate $");
        int hourlyRate = input.nextInt();

        int weeklySalary = hourlyRate * 40;
        int monthlySalary = weeklySalary * 52/12;
        int annualSalary = monthlySalary * 12;
        double rate = 0.70; //(1 - tax rate)

        System.out.println("Hourly rate is $" + hourlyRate + "   After tax is $" + hourlyRate * rate);
        System.out.println("Weekly: $" + weeklySalary + "   After tax is $" + weeklySalary * rate);
        System.out.println("Monthly: $" + monthlySalary + "   After tax is $" + monthlySalary * rate);
        System.out.println("Annually: $" + annualSalary + "   After tax is $" + annualSalary * rate);
        System.out.println("For 40 years career: $" + annualSalary*40 + "   After tax is $" + (annualSalary*40)*rate);
    }
}
