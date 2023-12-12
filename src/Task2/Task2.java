package Task2;
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        Student aspirant = new Aspirant("Roman", "Vasilyev",
                "SE-2334", 4, "Some scientific work");
        Student student1 = new Student("Nurlan", "Kurmetov", "SE-2326", 5);
        Student student2 = new Student("Adlet", "Kanatbekov", "SE-2334", 3.9);
        Student student3 = new Student("Ansar", "Shangilov", "SE-231", 4.2);

        ArrayList<Student> studentsArr = new ArrayList<>();

        studentsArr.add(aspirant);
        studentsArr.add(student1);
        studentsArr.add(student2);
        studentsArr.add(student3);

        for (Student student: studentsArr) {
            System.out.println(student.getScholarship());
        }
    }
}
