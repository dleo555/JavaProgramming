package day000_Replit_assignments;
import java.util.*;
public class a {
    public static void main(String[] args) {
        //input variables
        Scanner scan = new Scanner(System.in);
        String split = "";
        int numberOfPeople = 0;
        double checkAmount = 0;
        String serviceQuality = "";

        //output variables
        double tips = 0;
        double tipsPercentage = 0;
        double total = 0;
        String numberOfPeopleInSign = "";

        //input
        System.out.println("Split:");
        split = scan.next();
        System.out.println("Number of people:");
        numberOfPeople = scan.nextInt();
        System.out.println("Check amount:");
        checkAmount = scan.nextDouble();
        System.out.println("Service Quality:");
        serviceQuality = scan.next();

        //calculations
        if (serviceQuality.equalsIgnoreCase("Excellent")){
            tipsPercentage = 0.25;
        } else if (serviceQuality.equalsIgnoreCase("Great")){
            tipsPercentage = 0.20;
        } else if (serviceQuality.equalsIgnoreCase("Good")) {
            tipsPercentage = 0.15;
        } else if (serviceQuality.equalsIgnoreCase("Fair")) {
            tipsPercentage = 0.10;
        } else if (serviceQuality.equalsIgnoreCase("Poor")) {
            tipsPercentage = 0.05;
        }
        tips = checkAmount * tipsPercentage;
        total = tips + checkAmount;
        for (int i = 0; i < numberOfPeople ; i++) {
            numberOfPeopleInSign += "&";
        }

        //output
        if (split.contains("Yes")) {
            System.out.println("Number of people entered: " + numberOfPeopleInSign);
            System.out.println("Total to pay: " + total);
            System.out.println("Total tip: " + tips);
            System.out.println("Total per person: " + total/numberOfPeople);
            System.out.println("Tip per person: " + tips/numberOfPeople);
        } else {
            System.out.println("Number of people entered: " + numberOfPeopleInSign);
            System.out.println("Total to pay: " + total);
            System.out.println("Total tip: " + tips);
            System.out.println("Total per person: " + total);
            System.out.println("Tip per person: " + tips);
        }
    }
}