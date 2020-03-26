package day31_multidarrays_methods;

public class ValidDate {
    public static void main(String[] args) {
      /*  Warm up task:

        12, 21, 2019
        15, 21, 2019
        2, 30, 2020
        4, 31, 2000
                -----------
                Month valid -> 1-12
        Valid day -> 1-30/31 -> 1-28/29
        Valid year -> any positive | leap year or no

        month/day/year
        int[] date = {12, 21, 2019};
        boolean isValidDate ; */
        int[] date = {12, 21, 2019};

        if ((date[0] <= 0 || date[0] > 12) || (date[1] <=0 || date [1] > 31) || (date[2] <=0)) {
            System.out.println("not valid");
        } else {
            System.out.println("valid");}

        //=============================================================
        int month = date[0];
        int day   = date[1];
        int year  = date[2];
        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Valid date");
                break;
            case 4: case 6: case 9: case 11:
                if(day == 31){
                    System.out.println("Invalid date");
                }else{
                    System.out.println("Valid date");
                }
                break;
            case 2:
                //TODO: Check february based on leap year
                if( day > 29){
                    System.out.println("Invalid date");
                }else{
                    System.out.println("Valid date");
                }
                break;
        }
    }
}
