import clients.*;
import clients.Personal.Doctor;
import clients.Personal.Nurse;
import clients.impl.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Doctor doc = new Doctor("Morgan Freeman", LocalDate.of
                (1989, 4, 17), LocalDate.of
                (1921, 10, 31), 120000);
        Nurse nurse = new Nurse("Джо Байден", LocalDate.of
                (1989, 1, 20), LocalDate.of
                (2020, 9, 13), 90000);

        Animal lion = new Lion("Вася", 7, LocalDate.now(), new Owner());
        Swimable watersnake = new WaterSnake("Бяка", 7, LocalDate.now(), new Owner());
        watersnake.sound();

        List<Animal> flyable = new ArrayList<>();
        flyable.add(new Duck("Дональд", 3, LocalDate.now(), null));
        flyable.add(new Eagle("Арьол", 5, null, null));
        // flyable.add(dog);
        for (Animal animals : flyable){
            if (animals instanceof Flyable){
                ((Flyable)animals).fly();
            }
        }

        Animal dog = new Dog("Боня", 4, LocalDate.now(), new Owner());
        Animal duck = new Duck("Дональд", 3, LocalDate.now(), new Owner());
        Animal eagle = new Eagle("Гордый", 15, LocalDate.now(), new Owner());
        VeterinaryClinic clinic = new VeterinaryClinic("Чудные зверьки");

        clinic.addPersonal(doc);
        clinic.addPersonal(nurse);
        clinic.addAnimal(dog);
        clinic.addAnimal(eagle);

        System.out.println(clinic.getIllGoable());
        System.out.println(clinic.getSalary(doc));
        clinic.setSalary(doc, 130000);
        System.out.println(clinic.getSalary(doc));
    }
}