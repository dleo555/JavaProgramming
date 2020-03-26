package day41_OOP;

public class BestBuyTVs {
    public static void main(String[] args) {
     //crate TV object - LG 1122, false, 5
        TV lg = new TV();
        ///lg.brand = "LG 1122";
        //lg.isOn = false;
        //lg.channel = 5;
//=================================================================
        lg.setTVInfo("LG 1122", false, 5);
        System.out.println(lg.toString());
        System.out.println(lg);

        TV sm = new TV();
        sm.setTVInfo("Samsung 003", true, 10);
        System.out.println(sm.toString());

        //test turnOn, turnOff, methods;
        System.out.println("lg " + lg.isOn);
        lg.turnOn();
        System.out.println("lg "+ lg.isOn);

        System.out.println("sm " + sm.isOn);
        sm.trunOff();
        System.out.println("sm " + sm.isOn);

        TV sony = new TV();
        sony.setTVInfo("One", true, 1);
        System.out.println(sony.toString());
        sony.setChannel();
        System.out.println(sony.toString());

    }
}
