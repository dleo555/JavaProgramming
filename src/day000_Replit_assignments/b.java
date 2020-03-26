package day000_Replit_assignments;
import java.util.*;
public class b {
    public static void main(String[] args) {
        double price = 0;
        String storageType, screenType, cpu;
        int ram = 0 ;
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE

        //input
        System.out.println("Select screen size:");
        screenType = scan.next();
        System.out.println("Select CPU type:");
        cpu = scan.next();
        System.out.println("Select RAM size:");
        ram = scan.nextInt();
        System.out.println("Select storage type:");
        storageType = scan.next();
        System.out.println("Enter memory size:");
        int memorySize = scan.nextInt();
        System.out.println("Enter screen resolution");
        String resolution = scan.next();

        //calculation
        switch (screenType) {
            case "13.3":
                price += 200;
                break;
            case "15.0":
                price += 300;
                break;
            case "17.3":
                price += 400;
                break;
        }

        switch (cpu) {
            case "i3":
                price += 150;
                break;
            case "i5":
                price += 250;
                break;
            case "i7":
                price += 350;
                break;
        }

        for (int i = 0; i < ram ; i+=4) {
            price += 50;
        }

        if (storageType.equalsIgnoreCase("HDD")){
            for (int i = 0; i < memorySize; i+=500) {
                price += 50;
            }
        } else if (storageType.equalsIgnoreCase("SSD")) {
            for (int i = 0; i < memorySize; i+=500) {
                price += 100;
            }
        }

        if (resolution.equalsIgnoreCase("FULLHD")){
            price += 100;
        } else {
            price +=200;
        }
        //output
        System.out.println("Laptop price is: " + price);

    }
}
