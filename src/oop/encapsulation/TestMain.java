package oop.encapsulation;

public class TestMain {
    public static void main(String[] args) {
        Animals animals = new Animals("Dang", "Hi! Chao cau", "BD");
        System.out.println(animals);

        // giai thich
        animals.setName("Manh");
        System.out.println(animals);
    }
}
