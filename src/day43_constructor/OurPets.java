package day43_constructor;

public class OurPets {
    public static void main(String[] args) {
        Pet Shrek = new Pet();
        Shrek.setType("dog");
        Shrek.setName("Shrek");
        System.out.println(Shrek.toString());


        Shrek.speak();

        Pet laika = new Pet ("dog", "Laika");
    }
}
