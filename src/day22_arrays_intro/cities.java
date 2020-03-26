package day22_arrays_intro;

public class cities {
    public static void main(String[] args) {
        String [] cities = {"Ankara", "Moscow", "Baku", "Kabul", "Manila", "Tashkent", "Bucharest"};

        for (String city : cities){
            if (city.length() >6)
            System.out.println(city + " " + city.toUpperCase());
        }

        for (String city : cities){
            if (city.contains("u"))
                System.out.println(city + " " + city.toUpperCase());
        }
    }
}
