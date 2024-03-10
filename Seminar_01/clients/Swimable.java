package clients;

@FunctionalInterface

public interface Swimable {

    double pi = 3.14;

    double swim();

    default void sound() {
        System.out.println("Я дефолтный метод.");
    }
}
