package Lesson6;

import java.util.Random;

public class Animals {
    protected String name;
    protected String type;
    protected int maxRun;
    protected int maxSwim;
    public Random random = new Random();

    public Animals(String name){
        this.name = name;
    }

    public void run(int dist) {
        if (this.maxRun >= dist) System.out.println(this.type + " " + this.name + " run " + dist + " m.");
        else System.out.println(this.type + " " + this.name + " can't run so far.");
    }

    public void swim(int dist) {
        if (this.maxSwim >= dist) System.out.println(this.type + " " + this.name + " swim " + dist + " m.");
        else System.out.println(this.type + " " + this.name + " can't swim so far.");
    }
    public void info() { // выводит сведения об объекте в разрезе дейсвтий
        System.out.println(this.type + " " + this.name + " Run: " + this.maxRun + " m., Swim: " + this.maxSwim);
    }
}


