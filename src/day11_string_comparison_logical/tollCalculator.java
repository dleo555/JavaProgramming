package day11_string_comparison_logical;

public class tollCalculator {
    public static void main(String[] args) {
        /*vehicle type = car
        is rush hour = true
        -> price car no rush - 3
        -> car rush - 7.5
        -> truck no rush 4.75
        -> truck rush 11.5
        -> else vehicle not recognized */

        String vehicleType = "car";
        boolean rushHour = true;
        double tollPrice;

        if (vehicleType.equalsIgnoreCase("car") && rushHour == false) {
            tollPrice = 3;
            System.out.println("Vehicle type: car. non-rush hour: $" + tollPrice);
        } else if (vehicleType.equalsIgnoreCase("car") && rushHour == true) {
            tollPrice = 7.5;
            System.out.println("Vehicle type: car. rush hour: $" + tollPrice);
        } else if (vehicleType.equalsIgnoreCase("truck") && rushHour == false) {
            tollPrice = 4.75;
            System.out.println("Vehicle type: truck. non-rush hour: $" + tollPrice);
        } else if (vehicleType.equalsIgnoreCase("truck") && rushHour == true) {
            tollPrice = 11.5;
            System.out.println("Vehicle type: truck. rush hour: $" + tollPrice);
        } else {
            System.out.println("Other vehicle type. Wrong road!");
        }
    }
}
