package clients;
import java.time.*;

import java.time.LocalDate;

public class Animal {
    public String name;
    public float weight;
    public LocalDate age;
    public Owner owner;

    public Animal(String name, float weight, LocalDate age, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.owner = owner;
    }

    public String getType() {
        return getClass().getSimpleName();
    }
    
    @Override
    public String toString() {
        
        return String.format("name = %s, weight = %s, age = %s, owner = %s", name, weight, age, owner);
    }
}
