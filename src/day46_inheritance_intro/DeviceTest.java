package day46_inheritance_intro;

public class DeviceTest {
    public static void main(String[] args) {
        Device device = new Device();
        device.brand = "LG";
        device.price = 900;
        device.country = "South Korea";
        device.use();

        System.out.println("------------------------------------------------------------------------");

        TV tv = new TV();
        tv.brand = "Sony";
        tv.price = 800;
        tv.country = "Japan";
        tv.screenSize = 55;
        tv.isSmart = true;
        tv.use();
        tv.watch();

        System.out.println("------------------------------------------------------------------------");

        Phone phone = new Phone();
        phone.brand = "Apple iPhone";
        phone.price = 912.99;
        phone.country = "China";
        phone.carrier = "Sprint";
        phone.use();
        phone.call();
        phone.text();

        System.out.println("------------------------------------------------------------------------");

        smartPhone smartPhone = new smartPhone();
        smartPhone.brand = "Samsung";
        smartPhone.price = 890;
        smartPhone.country = "South Korea";
        smartPhone.carrier = "Verizon";
        smartPhone.memorySize = 128;
        smartPhone.use();
        smartPhone.call();
        smartPhone.text();
        smartPhone.useApp("Slack");
    }
}
