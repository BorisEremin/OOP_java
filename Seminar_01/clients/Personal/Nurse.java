package clients.Personal;

import clients.Animal;

import java.time.LocalDate;

public class Nurse extends Works {

    public Nurse(String name, LocalDate age, LocalDate EmplDate, double salary) {
        super(name, age, EmplDate, salary);
    }

    @Override
    public void toWork() {
    }

    public void Vacinate(Animal animal){
        System.out.println(animal.getType() + " " + animal.getName() + " ставит вакцину " + name);
    }

    public void help() {
        System.out.println(name + " помогает врачу.");
    }
}
