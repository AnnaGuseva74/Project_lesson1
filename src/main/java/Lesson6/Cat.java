package Lesson6;

public class Cat extends Animals {
    public Cat(String name) {
        super(name);
        this.maxRun = random.nextInt(45) + 155;
        this.type = "Cat";
    }

    @Override
    public void swim(int dist) {
        System.out.println("Cat's no swim!");
    }
}
