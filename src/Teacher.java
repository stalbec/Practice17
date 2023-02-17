import java.util.Arrays;

public class Teacher extends Person {
     private Student[] students;


    public Teacher(String firstName, String lastName, int age, String email, int phoneNumber, Student[] students) {
        super(firstName, lastName, age, email, phoneNumber);
        this.students = students;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "students=" + Arrays.toString(students) +
                '}'+super.toString();
    }

    @Override
    public void relationship() {
        System.out.println("teacher");

    }
}
