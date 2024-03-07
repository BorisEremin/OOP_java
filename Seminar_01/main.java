import java.time.LocalDate;
import java.util.*;

import clients.*;

public class main {

    public static void main(String[] args) {
        Animal Leva = new Lion("Лева", 200, LocalDate.now(), new Owner());
        Lion Bonya = new Lion("Боня", 350, LocalDate.now(), new Owner());
        Dog Spike = new Dog("Спайк", 4, LocalDate.now(), new Owner());
    
        Leva.lifeCicle();

        List<Animal> animals = new ArrayList<>();
        animals.add(Leva);
        animals.add(Spike);
        animals.add(Bonya);
        System.out.println(animals);

        // System.out.println(Leva.getWeight());
        // Lion test = new Lion();
        // System.out.println(test);
        // System.out.println(Bonya);
        // System.out.println(Bonya.getType());
        // System.out.println(Spike);
        // System.out.println(Spike.getType());
    }
}