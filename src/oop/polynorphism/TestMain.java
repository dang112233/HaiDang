package oop.polynorphism;

public class TestMain {
    public static void main(String[] args) {
        Animals dog = new Dog();
        Animals cat = new Cat();

        System.out.println(dog.getSpeak());
        System.out.println(cat.getSpeak());
    }
}
