package Lesson6;

public class Dog extends Animals {
    public Dog(String name) {
        super(name);
        this.type = "Dog";
        this.maxRun = random.nextInt(300) + 200;
        this.maxSwim = random.nextInt(6) + 4;
    }
}

