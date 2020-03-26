package day48_overriding;

public class AnimalTest extends Cat{
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move();
        animal.speak();

        Cat cat = new Cat();
        cat.move();
        cat.speak();

        Horse horse = new Horse();
        horse.speak();







    }
}
