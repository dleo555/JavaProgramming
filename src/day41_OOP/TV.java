package day41_OOP;

public class TV {
    String brand;
    boolean isOn;
    int channel;
    //methods/behaviours;
    public void setTVInfo (String pBrand, boolean pIsOn, int pChannel){
        System.out.println("INFO: setting TV information...");
        brand = pBrand;
        isOn = pIsOn;
        channel = pChannel;
    }
    public String toString() {//must be in the code. RIGHT CLICK --> Generate ->toString
        return "TV{" +
                "brand='" + brand + '\'' +
                ", isOn=" + isOn +
                ", channel=" + channel +
                '}';
    }
    public void turnOn (){
        if (isOn){
            System.out.println("WARNING: "+ brand + " TV is already on");
        } else {
            System.out.println("INFO: turning on " + brand + " TV");
            isOn = true;
        }
    }
    public void trunOff (){
        if (isOn){
            System.out.println("INFO: turning off " + brand + " TV");
            isOn = false;
        } else {
            System.out.println("WARNING: " + brand + " TV is on");
        }
    }

    public void setChannel (){
        channel++;
    }

}
