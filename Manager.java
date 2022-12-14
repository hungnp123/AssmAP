import java.util.ArrayList;
import java.util.List;

public class Manager extends Teacher_manager{
    List<Person> students;
    List<Person> teachers;

    public Manager() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }

    public void addStudent(Person student) {
        this.students.add(student);
    }

    public void search(String id) {
        Person n = this.students.stream()
            .filter(student -> student.getId().equals(id))
            .findFirst().orElse(null);
            if (n == null) {
                System.out.println("has no student with this id");
            }
            System.out.println(n.toString());
    }

    public void deleteStudent(String id)  {
        Person n = this.students.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst().orElse(null);
        if (n == null) {
            System.out.println("has no student with this id");
        }
        this.students.remove(n);
            System.out.println("delete successfuly");
    }

    public void showAll(){
        this.students.forEach(students -> System.out.println(students.toString()));
    }
    public void showGoodStudent() {
        this.students.stream()
            .filter(n -> n instanceof Good_student)
            .forEach(n -> System.out.println(n.toString()));
    }
    public void showNormalStudent() {
        this.students.stream()
            .filter(n -> n instanceof Normal_student)
            .forEach(n -> System.out.println(n.toString()));
    }

    @Override
    public void addteacher() {
        try {
            System.out.println("Enter ID: ");
            String id = sc.nextLine();
            System.out.println("Enter name: ");
            String name = sc.nextLine();
            System.out.println("Enter date of birth: ");
            String dob = sc.nextLine();
            System.out.println("Enter email: ");
            String email = sc.nextLine();
            System.out.println("Enter salary: ");
            String salary = sc.nextLine();
            Teacher teacher = new Teacher(id, name, dob, email, salary);
            this.teachers.add(teacher);
            System.out.println(teacher.toString());
            sc.nextLine();
        } catch (NumberFormatException e) {
            System.out.println("Please enter the correct format!!!");
        }
        
    }

    @Override
    public void showteacher() {
        this.teachers.forEach(teachers -> System.out.println(teachers.toString()));
    }

    @Override
    public void searchteacher(String id) {
        Person n = this.teachers.stream()
            .filter(teacher -> teacher.getId().equals(id))
            .findFirst().orElse(null);
            if (n == null) {
                System.out.println("has no person with this id");
            }
            else{
                System.out.println(n.toString());
            }
    }

    @Override
    public void removeteacher(String id) {
        Person x = this.teachers.stream()
                .filter(teacher -> teacher.getId().equals(id))
                .findFirst().orElse(null);
        if (x == null) {
            System.out.println("has no person with this id");
        }
        else{
            this.teachers.remove(x);
            System.out.println("delete successfuly");
        }
    }
}
