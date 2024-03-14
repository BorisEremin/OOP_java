import clients.*;
import clients.Personal.Doctor;
import clients.Personal.Nurse;
import clients.impl.*;
import pharmacy.Medicine;
import pharmacy.Medicine2;
import pharmacy.MedicineComponent;
import pharmacy.impl.Asitromin;
import pharmacy.impl.Milbemax;
import pharmacy.impl.Peniciline;
import pharmacy.impl.Spirtus;
import pharmacy.impl.Vetbicid;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class main {
    public static void main(String[] args) {

        ArrayList<MedicineComponent> medLists = new ArrayList<>();
        ArrayList<Medicine2> medList2 = new ArrayList<>();
        Asitromin asitrom = new Asitromin("Аситромин", 50, 70);
        Peniciline penicil = new Peniciline("Пеницилин", 30, 50);
        Vetbicid vetbic = new Vetbicid("Ветбицит", 40, 10);
        Spirtus spirt = new Spirtus("Спирт", 100, 100);
        Milbemax milb = new Milbemax("Милбельмакс", 10, 15);

        Medicine2 medicine = new Medicine2("Инъекции");
        medicine.addComponent(vetbic).addComponent(asitrom).addComponent(penicil);
        // for (MedicineComponent component : medicine) {

        // }

        Medicine2 medicine1 = new Medicine2("Лекарства");
        medicine1.addComponent(penicil).addComponent(spirt).addComponent(milb);
        // Medicine2 medicine2 = new Medicine2("Таблетки");
        // medicine2.addComponent(milb);

        medList2.add(medicine);
        medList2.add(medicine1);
        // medList2.add(medicine2);

        Comparator<Medicine2> byNameLenght = new Comparator<Medicine2>() {

            @Override
            public int compare(Medicine2 o1, Medicine2 o2) {
                return o1.getName().length() - o2.getName().length();
            }
        };

        System.out.println(medList2);
        Collections.sort(medList2, byNameLenght);
        System.out.println(medList2);

        // Iterator<MedicineComponent> med = medicine;
        // while (med.hasNext()) {
        //     System.out.println(med.next());
        // }
        

        // Doctor doc = new Doctor("Morgan Freeman", LocalDate.of
        //         (1989, 4, 17), LocalDate.of
        //         (1921, 10, 31), 120000);
        // Nurse nurse = new Nurse("Джо Байден", LocalDate.of
        //         (1989, 1, 20), LocalDate.of
        //         (2020, 9, 13), 90000);

        // Animal lion = new Lion("Вася", 7, LocalDate.now(), new Owner());
        // Swimable watersnake = new WaterSnake("Бяка", 7, LocalDate.now(), new Owner());
        // watersnake.sound();

        // List<Animal> flyable = new ArrayList<>();
        // flyable.add(new Duck("Дональд", 3, LocalDate.now(), null));
        // flyable.add(new Eagle("Арьол", 5, null, null));
        // // flyable.add(dog);
        // for (Animal animals : flyable){
        //     if (animals instanceof Flyable){
        //         ((Flyable)animals).fly();
        //     }
        // }

        // Animal dog = new Dog("Боня", 4, LocalDate.now(), new Owner());
        // Animal duck = new Duck("Дональд", 3, LocalDate.now(), new Owner());
        // Animal eagle = new Eagle("Гордый", 15, LocalDate.now(), new Owner());
        // VeterinaryClinic clinic = new VeterinaryClinic("Чудные зверьки");

        // clinic.addPersonal(doc);
        // clinic.addPersonal(nurse);
        // clinic.addAnimal(dog);
        // clinic.addAnimal(eagle);

        // System.out.println(clinic.getIllGoable());
        // System.out.println(clinic.getSalary(doc));
        // clinic.setSalary(doc, 130000);
        // System.out.println(clinic.getSalary(doc));

    }
}