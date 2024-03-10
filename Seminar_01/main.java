import clients.*;
import clients.impl.Eagle;
import clients.impl.Lion;
import clients.impl.WaterSnake;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Animal lion = new Lion("Вася", 7, LocalDate.now(), new Owner());
        Swimable watersnake = new WaterSnake("Бяка", 7, LocalDate.now(), new Owner());
        watersnake.sound();
        List<Flyable> flyables = new ArrayList<>();
        flyables.add(new Eagle("Горняк", 10, LocalDate.now(), new Owner()));
        // Lion Leva = new Lion("Лёва", 45, LocalDate.now(), new Owner());
        // Lion Spike = new Lion("Спайк", 40, LocalDate.now(), new Owner());
        // // Cat cat1 = new Cat("Мурзик", 9, LocalDate.now(), new Owner());
        // Eagle eagle1 = new Eagle("Орёл", 21, LocalDate.now(), new Owner());
        // WaterSnake snake1 = new WaterSnake("Сэм", 5, LocalDate.now(), new Owner());

        // System.out.println(Leva);
        // System.out.println(Spike);
        // System.out.println(snake1);
        // System.out.println(eagle1);

        // List<Animal> animals = new ArrayList<>();
        // animals.add(Leva);
        // animals.add(Spike);
        // animals.add(snake1);
        // animals.add(eagle1);
        
        // Leva.LionLifeCycle();
        // Spike.LionLifeCycle();
        // eagle1.EagleLifeCycle();
        // snake1.SnakeLifeCycle();
    }
}