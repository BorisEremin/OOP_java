package clients.impl;
import clients.Animal;
import clients.Goable;
import clients.Owner;

import java.time.LocalDate;

public class Dog extends Animal implements Goable {
    public Dog(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Собака ест");
    }

    public void DogLifeCycle() {
        woof();
        run();
    }

    private void woof() {
        System.out.println(getType() + " лает");
    }

    @Override
    public double run() {
        return 50;
    }
}