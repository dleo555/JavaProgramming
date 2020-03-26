package day50_inheritance_hiding;

public class CityObject {
    public static void main(String[] args) {
        City city = new City("Calamba");
        CapitalCity capital = new CapitalCity("Moscow", "Russia", 20000000);

        System.out.println(city.toString());
        System.out.println(capital.toString());

        CapitalCity ankara = new CapitalCity("Ankara", "Turkey", 8000000);



    }
}
