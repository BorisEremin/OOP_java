package clients;

import java.time.LocalDate;

public class WaterSnake extends Animal{
    public WaterSnake(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public void SnakeLifeCycle() {
        swim();
        swim("укрытию");
    }

    protected void swim() {
        System.out.println(getType() + " Плавает");
    }

    private void swim(String place) {
        System.out.println(getType() + " плывет к " + place);
    }

    protected void fly(){
        System.out.println("Змеи не летают.");
    }
}
