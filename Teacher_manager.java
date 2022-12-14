import java.util.Scanner;

public abstract class Teacher_manager {
    protected static Scanner sc = new Scanner(System.in);

    public abstract void addteacher();
    public abstract void showteacher();
    public abstract void searchteacher(String id);
    public abstract void removeteacher(String id);
}


