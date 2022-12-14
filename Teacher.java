public class Teacher extends Person{
    private String salary;

    public Teacher(String id, String name, String dob, String email, String salary) {
        super(id, name, dob, email);
        this.salary = salary;
    }
    
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "-----------------Teachears-----------------" + '\n'
            + "- ID:     " + id + '\n'
            + "- Name:     " + name +'\n'
            + "- Date of birth:     " + dob +'\n'
            + "- Email:     " + email +'\n'
            + "- Salary:     " + salary + '\n'
            + " =========================================== ";
    }
}
