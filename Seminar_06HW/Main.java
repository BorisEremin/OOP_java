package Seminar_06HW;

public class Main{
    public static void main(String[] args){
        Saver saver = new SaveUser();
        ReportUser reporter = new ReportUser();
        User user = new User("Boris");
        reporter.report(user);
        saver.save(user);
    }
}