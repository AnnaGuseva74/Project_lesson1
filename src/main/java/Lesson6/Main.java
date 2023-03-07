package Lesson6;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Вася");
        Cat cat2 = new Cat("Кузя");

        Dog dog1 = new Dog("Тузик");
        Dog dog2 = new Dog("Бобик");

        cat1.info();
        cat2.info();

        System.out.println();

        dog1.info();
        dog2.info();

        System.out.println();

        dog1.run(400);
        dog1.swim(5);

        System.out.println();

        cat1.run(1700);
        cat1.swim(5);
    }
}
