package day40_custom_classes;

public class Car {

    String model;
    String color;
    double price;
    int year;
        int drive;
        int showPrice;


    public void setCarInfo(String newModel, double newPrice,
                           String newColor, int newYear){
        //assign param variables to object variables
        model = newModel;
        price = newPrice;
        color = newColor;
        year = newYear;
    }
}