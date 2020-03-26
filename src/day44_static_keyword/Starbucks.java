package day44_static_keyword;
import java.util.*;
public class Starbucks {
    //------------------------------------------------------------------------------------------
    public static void drinkCoffee (coffee coffeeObj) {
        System.out.println("Drinking " + coffeeObj.getType() + " and coding java" );
    }

    public static coffee orderCoffee (String coffeeName, String coffeeSize){
        coffee readyCoffee = new coffee(coffeeName, coffeeSize, 0.99);
        return readyCoffee;
    }

    //------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        coffee cappuccino = new coffee("cappucino", "grande", 3.99);
        cappuccino.drink();
        System.out.println(cappuccino.toString());

        //syntax for arrays of coffees
        coffee[] coffeeArray = new coffee[2];
        coffeeArray [0] = cappuccino;
        coffeeArray [1] = new coffee("cappuccino", "grande",5.99);
        System.out.println(Arrays.toString(coffeeArray));

        //ArrayList of coffees
        List <coffee> coffeeList = new ArrayList<>();
        coffeeList.add(cappuccino);
        coffeeList.add(coffeeArray[1]);
        coffeeList.add(new coffee("Nitro Brew", "tall", 3.49));
        System.out.println(coffeeList.toString());

        //drink first coffee
        coffeeList.get(0).drink();

        //drink all of them
        for (coffee eachCoffee : coffeeList) {
            eachCoffee.drink();
        }
        //------------------------------------------------------------------------------------------
        System.out.println("----Call custom method - drinkCoffee----");
        coffee hotChocolate = new coffee("Hot Chocolate", "venti", 4.99);
        drinkCoffee(hotChocolate);
        drinkCoffee(cappuccino);
        //-----------------------------------------------------------------------------------------
        System.out.println("----Call custom method - orderCoffee----");
        orderCoffee("white mocha", "grande");

    }
}
