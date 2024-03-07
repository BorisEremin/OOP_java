import java.time.LocalDate;

import clients.*;
public class main {

    public static void main(String[] args) {
        Lion Leva = new Lion("Лева", 200, LocalDate.now(), new Owner());
        System.out.println(Leva);
    }
}