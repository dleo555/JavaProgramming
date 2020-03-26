package day43_constructor;
import java.util.*;
public class ComputerList {
    public static void main(String[] args) {
        //Declare list of Computers
        List <Computer> compList = new ArrayList<>();

        compList.add(new Computer("HP14" , "Win10", 219.99  ));
        compList.add(new Computer("HP15" , "Win11", 319.99  ));
        compList.add(new Computer("HP16" , "Win12", 419.99  ));
        compList.add(new Computer("HP17" , "Win13", 519.99  ));
        compList.add(new Computer("HP18" , "Win14", 819.99  ));

        //Print number of computers
        System.out.println(compList.size());

        //print first computer brand and price
        System.out.println(compList.get(0));

        //using for loop, print number then PC description
        for (int i = 0; i < compList.size(); i++) {
            System.out.println((i+1) + ". " + compList.get(i).getBrand());

        }

        //using for each loop. print number then comp. discription
        int counter = 1;
        for (Computer eachComp : compList){
            System.out.println(counter + ". " + eachComp.toString());
            counter++;
        }

        //print Brand and price for computers within your budget
        double myBudget = 800;
        for (int i = 0; i < compList.size(); i++) {
            if (compList.get(i).getPrice() <= myBudget)
            System.out.println((i + 1) + ". " + compList.get(i).getPrice());

        }

        //print total price for all PC
        double totalPrice = 0;
        for (int i = 0; i < compList.size(); i++) {
                totalPrice += compList.get(i).getPrice();
        }
        System.out.println(totalPrice);

    }
}
