package clients;
import java.time.LocalDate;

public class Eagle extends Animal{

    public Eagle(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public void EagleLifeCycle() {
        cleanFeathers();
        fly();
        fly("горе", "охоты");
        hunt();
    }

    private void cleanFeathers(){
        System.out.println(getType() + " Чистит оперенья");
    }

    protected void fly(){
        System.out.println(getType() + " Летает");
    }

    private void fly(String place){
        System.out.println(getType() + " Летит к " + place);
    }

    private void fly(String place, String goal){
        System.out.println(getType() + " летит к " + place + " для " + goal);
    }

    private void hunt(){
        System.out.println(getType() + " охотится");
    }

    protected void swim(){
        System.out.println("Орлы не умеют плавать");
    }
}