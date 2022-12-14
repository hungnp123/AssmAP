import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Manager managerStudent = new Manager();
            while (true) {
                System.out.println(" _____________________o0o____________________");
                System.out.println("|         Student and teacher Manager        |");
                System.out.println("|--------------------------------------------|");
                System.out.println("| 1. Student Management                      |");
                System.out.println("| 2. Teacher Management                      |");
                System.out.println("| 3. Exit                                    |");
                System.out.println("|____________________________________________|");
                String line = sc.nextLine();
                switch (line){
                    case "1": {
                        System.out.println(" _____________________o0o____________________");
                        System.out.println("|               Student Manager              |");
                        System.out.println("|--------------------------------------------|");
                        System.out.println("| 1. Add new students                        |");
                        System.out.println("| 2. Show students                           |");
                        System.out.println("| 3. Search for students                     |");
                        System.out.println("| 4. Delete student by ID                    |");
                        System.out.println("| 5. Exit                                    |");
                        System.out.println("|____________________________________________|");
                        String line1 = sc.nextLine();
                        switch (line1){
                            case "1": {
                                System.out.println("Enter a: to add a Good student");
                                System.out.println("Enter b: to add a Normal student");
                                String menu1 = sc.nextLine();
                                switch (menu1) {
                                    case "a": {
                                        try {
                                            System.out.println("Enter ID: ");
                                            String id = sc.nextLine();
                                            System.out.println("Enter name: ");
                                            String name = sc.nextLine();
                                            System.out.println("Enter date of birth: ");
                                            String dob = sc.nextLine();
                                            System.out.println("Enter email: ");
                                            String email = sc.nextLine();
                                            System.out.println("Enter scholarship: ");
                                            String scholarship = sc.nextLine();
                                            Person g_student = new Good_student(id, name, dob, email, scholarship);
                                            managerStudent.addStudent(g_student);
                                            System.out.println(g_student.toString());
                                            sc.nextLine();
                                        } catch (NumberFormatException e) {
                                            System.out.println("Please enter the correct format!!!");
                                        }
                                        break;
                                    }
                                    case "b": {
                                        try {
                                            System.out.println("Enter ID: ");
                                            String id = sc.nextLine();
                                            System.out.println("Enter name:");
                                            String name = sc.nextLine();
                                            System.out.println("Enter date of birth: ");
                                            String dob = sc.nextLine();
                                            System.out.println("Enter email: ");
                                            String email = sc.nextLine();
                                            System.out.println("Enter grade point average: ");
                                            int GPA = sc.nextInt();
                                            Person n_student = new Normal_student(id, name, dob, email, GPA);
                                            managerStudent.addStudent(n_student);
                                            System.out.println(n_student.toString());
                                            sc.nextLine();
                                        } catch (Exception e) {
                                            System.out.println("Please enter the correct format!!!");
                                        }
                                        break;
                                    }
                                    default:
                                        break;
                                }
                                break;
                            }
                            case "2": {
                                System.out.println("Enter a to show good students");
                                System.out.println("Enter b to show normal students");
                                System.out.println("Enter c to show all students");
                                String menu2 = sc.nextLine();
                                switch (menu2) {
                                    case "a": 
                                        managerStudent.showGoodStudent();
                                        break;
        
                                    case "b":
                                        managerStudent.showNormalStudent();
                                        break;
                                        
                                    case "c":
                                        managerStudent.showAll();
                                        break;    
                                }
                                break;
                            }
                            case "3": {
                                System.out.print("Enter id to search: ");
                                String id = sc.nextLine();
                                managerStudent.search(id);
                                break;
                            }
                            case "4": {
                                System.out.print("Enter id to delete: ");
                                String id = sc.nextLine();
                                managerStudent.deleteStudent(id);
                                break;
                            }
                            case "5": {
                                continue;
                            }
                            default:
                                System.out.println("Plesea enter a nummber in menu");
                            continue;
                        } 
                        break;               
                    } 
                    case "2": {
                        System.out.println(" _____________________o0o____________________");
                        System.out.println("|               Teacher Manager              |");
                        System.out.println("|--------------------------------------------|");
                        System.out.println("| 1. Add new teachers                        |");
                        System.out.println("| 2. Show teachers                           |");
                        System.out.println("| 3. Search for teachers                     |");
                        System.out.println("| 4. Delete teacher by ID                    |");
                        System.out.println("| 5. Exit                                    |");
                        System.out.println("|____________________________________________|");
                        String line2 = sc.nextLine();
                        switch (line2) {
                            case "1": {
                                managerStudent.addteacher();
                                break;
                            }
                            case "2":{
                                managerStudent.showteacher();
                                break;
                            }
                            case "3":{
                                System.out.print("Enter id to search: ");
                                String id = sc.nextLine();
                                managerStudent.searchteacher(id);
                                break;
                            }
                            case "4": {
                                System.out.print("Enter id to delete: ");
                                String id = sc.nextLine();
                                managerStudent.removeteacher(id);
                                break;
                            }
                            case "5": {
                                continue;
                            }
                            default:
                                System.out.println("Plesea enter a nummber in menu");
                                continue;
                        } 
                    break;    
                    } 
                    case "3": {
                        System.out.println("Good bye!!!");
                        return;
                    }  
                }
            }
        }
    }
}               