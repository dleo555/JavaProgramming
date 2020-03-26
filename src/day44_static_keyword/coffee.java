package day44_static_keyword;
import java.util.*;
public class coffee {
        private String type;
        private String size; //(tall, grande, venti)
        private double price;

        //encapsulate, toString
        //2 constructors: - no-args
        //                - 3 args
        //---> drink(){print "Drinking grande latte that I bought for 4.19"}
    public coffee(String type, String size, double price) {
        this.type = type;
        this.setSize(size); //this.size = size (works the same, we can reuse the code, DON"T repeat myseld concept)
        this.price = price;
    }

    public coffee() {
        this.type = "undecided";
        this.size = "not sute";
        this.price = 0.0;
    }
//-------------------------------------------------------------------------------------
    //getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.equals("tall") | size.equals("grande") | size.equals("venti")) {
            this.size = size;
        } else {
            System.out.println("Invalid size");
            this.size = "unknown";
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //-----------------------------------------------------
    public void drink() {
        System.out.println("Drinking " + size + " " + type + " for $ " + price );
    }
    //-----------------------------------------------------

    @Override
    public String toString() {
        return "coffee{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
