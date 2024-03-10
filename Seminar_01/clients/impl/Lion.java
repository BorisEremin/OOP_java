package clients.impl;

import java.io.Serializable;
import java.time.LocalDate;

import clients.Animal;
import clients.Goable;
import clients.Owner;
import clients.Swimable;

public class Lion extends Animal implements Goable, Swimable{

    public Lion(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    @Override
    public void eat() {
        System.out.println("Лев кушает");
    }

    @Override
    public double run() {
        return 25;
    }

    @Override
    public double swim() {
        System.out.println("Лев купается");
        return 10;
    }
}

