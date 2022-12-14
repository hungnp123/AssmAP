public class Normal_student extends Person {
    private int GPA;

    public Normal_student(String id, String name, String dob, String email, int GPA) {
        super(id, name, dob, email);
        this.GPA = GPA;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int gPA) {
        GPA = gPA;
    }
    @Override
    public String toString(){
        return "---------------Normal Students---------------" + '\n'
            + "- ID:     " + id + '\n'
            + "- Name:     " + name +'\n'
            + "- Date of birth:     " + dob +'\n'
            + "- Email:     " + email +'\n'
            + "- GPA:     " + GPA + '\n'
            + " =========================================== ";
    }
}
