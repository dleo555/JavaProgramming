package day40_custom_classes;

public class CarGurus {
    public static void main(String[] args) {

        Car acura = new Car();
        acura.color = "white";
        acura.year = 2020;
        acura.model = "Acura ILX";
        acura.price = 28150.0;
        System.out.println("acura model: " + acura.model);
      //  acura.drive();
       // acura.showPrice();
        ///another car object
        Car bmw = new Car();
        bmw.model = "BMW 5 series";
        bmw.color = "Black";
        bmw.price = 51115.0;
        bmw.year = 2019;
       // bmw.drive();
       // bmw.showPrice();
    }
}
