package day30_practice;
import java.util.*;
public class CarInfo {
    public static void main(String[] args) {
       String car = "MINI-Cooper";
       //"MINI-Cooper" -> MINI-******
        String make = "";
        String model = "";
        //split or use substring, and get make and model
        //count  number of cars in model
        make = car.substring(0, car.indexOf("-"));
        System.out.println(make);
        model = car.substring(car.indexOf("-")+1, car.length());
        System.out.println(model);
        int carModelLength = model.length();
        System.out.println(carModelLength);
        //final result + for loop for *
        System.out.print(make + "-");
        for (int i = 0; i < carModelLength; i++) {
            System.out.print("*");
        }
    }
}
