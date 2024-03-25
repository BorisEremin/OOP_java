package homework;

public class User {

    private final String name;
    private Saver saver;
    private Reporter reporter;
   

    public User(String name) {
        this.name = name;
        this.saver = new SaveUser();
        this.reporter = new ReportUser();
    }

    public String getName() {
        return name;
    }
}