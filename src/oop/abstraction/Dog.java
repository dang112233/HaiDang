package oop.abstraction;

public class Dog implements Animals {

    public Dog() {
    }

    @Override
    public String name() {
        return "A";
    }

    @Override
    public String speak() {
        return "gau";
    }

    @Override
    public String toString() {
        return name() + " " + speak();
    }
}
