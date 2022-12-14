public class Good_student extends Person {
    private String scholarship;

    public Good_student(String id, String name, String dob, String email, String scholarship) {
        super(id, name, dob, email);
        this.scholarship = scholarship;
    }

    public String getScholarship() {
        return scholarship;
    }

    public void setScholarship(String scholarship) {
        this.scholarship = scholarship;
    }
    @Override
    public String toString(){
        return "---------------Good Students---------------" + '\n'
            + "- ID:     " + id + '\n'
            + "- Name:     " + name +'\n'
            + "- Date of birth:     " + dob +'\n'
            + "- Email:     " + email +'\n'
            + "- Scholarship:     " + scholarship + '\n'
            + " =========================================== ";
    }
}
