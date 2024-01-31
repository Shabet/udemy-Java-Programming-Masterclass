package ch11.ex01_AbstractClasses;

import ch11.ex01_AbstractClasses.Animal;

public class Fish extends Animal {

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equals("slow")) {
            System.out.println(getExplicitType() + " lazily swimming");
        } else {
            System.out.println(getExplicitType() + " darting frantically");
        }
    }

    @Override
    public void makeNoise() {

        if (type == "Golffish") {
            System.out.print("swish ");
        } else {
            System.out.print("splash ");
        }
    }
}
