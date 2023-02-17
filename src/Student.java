public class Student extends Person{
    private String group;

    public Student(String firstName, String lastName, int age, String email, int phoneNumber, String group) {
        super(firstName, lastName, age, email, phoneNumber);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "group='" + group + '\'' +
                '}' + super.toString();
    }



    @Override
    public void relationship() {
        System.out.println("students");


    }
}
