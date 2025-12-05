import java.util.logging.SimpleFormatter;

public class UniversitySystemTestDrive {
    public static void main() {
        Student student1 = new Student("938803","Shayan" , "shayan.pk1233@gmail.com", "CS",2);
        Course course1 = new Course(student1 , "add");
        System.out.println( course1.toString());
        Course course2 = new Course(student1 , "remove");
        System.out.println( course1.toString());
        System.out.println(course2.toString());

    }
}