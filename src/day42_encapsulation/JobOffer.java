package day42_encapsulation;

public class JobOffer {
    int hourlyPay;
    String location;
//---------------------------------------------------------------------
public void setHourlyPay (int hourlyPay){
 this.hourlyPay = hourlyPay;
}

public int getHourlyPay () {
    return hourlyPay;
}
//----------------------------------------------------------------------
public void setLocation (String location) {
    this.location = location;
}

public String getLocation () {
    return location;
}
//------------------------------------------------------------------------

    @Override
    public String toString() {
        return "JobOffer{" +
                "hourlyPay=" + hourlyPay +
                ", location='" + location + '\'' +
                '}';
    }
}
