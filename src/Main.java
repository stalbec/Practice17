import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
     Student student1 = new Student("Nargiza","Nurlanova",21,"Nargiza@gmail.com",
             555343433,"Java");
     Student student2 = new Student("Almaz","Jumaliev",22,"Almaz@gmail.com",
             502345678,"Java");
     Student student3 = new Student("Azat","Eshkenov",22,"Azat@gmail.com",
     555435276,"Java Script");
     Student student4 = new Student("Nurjan","Malikova",22,"Nurjan@gmail.com",
     555666666,"Java Script");


     Teacher teacher = new Teacher("Keremet","Alieva",45,"Keremet@gmail.com",
             502334455,new Student[]{student1,student2});
     Teacher teacher1 = new Teacher("Nurdin","Aladdinov",38,"Nurdin@gmail.com",
             555678903,new Student[]{student3,student4});
        System.out.println(teacher);

        System.out.println(teacher1);

        teacher.relationship();


    }
}