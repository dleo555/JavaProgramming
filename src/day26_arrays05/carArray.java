package day26_arrays05;

public class carArray {
    public static void main(String[] args) {
        String[] myCars = {"Ford", "Chevy",
                "Toyota", "Honda", "Mazda",
                "Kia", "Hyundai",
                "Bmw", "Audi", "Mercedes",
                "Fiat", "Ferrari", "Alfa Romeo",
                "Bugatti", "Renault"};

        //       if (myCars [0].equals("Ford") || myCars [0].equals("Chevy")){
//            System.out.println(myCars[0] + " is American Car");
        //      }

        for (int i = 0; i < myCars.length; i++) {
            // System.out.println(myCars[i]);
            if (myCars[i].equals("Ford") || myCars[i].equals("Chevy")) {
                System.out.println(myCars[i] + " is American Car");
            } else if (myCars[i].equals("Toyota") || myCars[i].equals("Honda") || myCars[i].equals("Mazda")) {
                System.out.println(myCars[i] + " is Japanese Car");
            }
        }
    }
}