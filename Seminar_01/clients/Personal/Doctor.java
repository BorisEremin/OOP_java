package clients.Personal;

import clients.Animal;
import clients.Personal.Works;

import java.time.LocalDate;

public class Doctor extends Works {

    private Works worker;

    public Doctor(String name, LocalDate age, LocalDate EmplDate, double salary) {
        super(name, age, EmplDate, salary);
    }

    @Override
    public void toWork() {
    }

    public void heal(Animal animal) {
        System.out.println("Врач осматривает " + animal.getType() + " " + animal.getName());
    }

    public void doOperation() {
        System.out.println("Врач на операции");
    }
}