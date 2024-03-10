package clients;

import clients.Personal.Works;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    protected String clinicName;
    private List<Works> Personal = new ArrayList<>();
    private List<Animal> Illanimals = new ArrayList<>();

    public VeterinaryClinic(String clinicName) {
        this.clinicName = clinicName;
        this.Illanimals = new ArrayList<>();
        this.Personal = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        Illanimals.add(animal);
    }

    public void addPersonell(Works worker) {
        Personal.add(worker);
    }

    public void removeAnimal(Animal animal) {
        Illanimals.remove(animal);
    }
    public void removePersonell(Works worker) {
        Personal.remove(worker);
    }

    public List<Animal> getIllFlyable(){
        List<Animal> flyable = new ArrayList<>();
        for (Animal animal : Illanimals){

            if (animal instanceof Flyable){

                flyable.add(animal);
            }
        }
        return flyable;

    }
    public List<Animal> getIllSwimmable() {

        List<Animal> swimmable = new ArrayList<>();
        for (Animal animal : Illanimals){

            if (animal instanceof Swimable){

                swimmable.add(animal);
            }
        }
        return swimmable;
    }

    public List<Animal> getIllGoable() {
        List<Animal> goable = new ArrayList<>();
        for (Animal animal : Illanimals){

            if (animal instanceof Goable){

                goable.add(animal);
            }
        }
        return goable;
    }

    public List<Works> getPersonell() {
        return Personal;
    }

    public double getSalary(Works worker) {
        return worker.getSalary();
    }

    public void setSalary(Works worker, double salary) {
        worker.setSalary(salary);
    }
}