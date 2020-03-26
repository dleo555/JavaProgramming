package day43_constructor;

public class Computer {
    String brand;
    String os;
    double price;

    public Computer () {
        System.out.println("Computer No-Args construction");
        this.brand = "unknown-brand";
        os = "unknown-os";
    }
    public Computer(String brand, String os, double price) {
        this.brand = brand;
        this.os = os;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", os='" + os + '\'' +
                ", price=" + price +
                '}';
    }
}
