package day46_inheritance_intro;

public class Phone extends Device{
    public String carrier;
    public void call(){
        System.out.println("Calling from "+ brand +" phone using "+ carrier);
    }
    public void text() {
        System.out.println("Texting from "+ brand +" phone using "+ carrier);
    }
}
