import java.time.LocalDate;

import clients.*;
public class main {

    public static void main(String[] args) {
        Lion Leva = new Lion("Лева", 200, LocalDate.now(), new Owner());
        Lion Bonya = new Lion("Боня", 350, LocalDate.now(), new Owner());
        Dog Spike = new Dog("Спайк", 4, LocalDate.now(), new Owner());
        System.out.println(Leva);
        System.out.println(Bonya);
        System.out.println(Bonya.getType());
        System.out.println(Spike);
        System.out.println(Spike.getType());
    }
}