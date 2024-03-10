package clients.impl;

import java.time.LocalDate;

import clients.Animal;
import clients.Owner;
import clients.Swimable;

public class WaterSnake extends Animal implements Swimable {
    public WaterSnake(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Змея ест");
    }

    public void SnakeLifeCycle() {
        fly();
    }

    protected void fly() {
        System.out.println("Змеи не летают.");
    }

    @Override
    public double swim() {
        return 10;
    }

}
