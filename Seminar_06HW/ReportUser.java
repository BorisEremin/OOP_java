package Seminar_06HW;

public class ReportUser implements Reporter {

    @Override
    public void report(User user) {
        System.out.println("Уведомление для: " + user.getName());
    }

}
