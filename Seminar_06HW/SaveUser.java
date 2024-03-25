package Seminar_06HW;

public class SaveUser implements Saver {

    @Override
    public void save(User user) {
        System.out.println("Пользователь "  + user.getName() + " сохранен");
    }

}
