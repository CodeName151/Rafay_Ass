import java.util.ArrayList;
public class Course {
    ArrayList<Student> Students = new ArrayList<>();
    public Course ( Student student , String Choice) {
//        ArrayList<Student> Students = new ArrayList<>();
        if(Choice.equalsIgnoreCase("add")) {
            Students.add(student);
        }
        else if(Choice.equalsIgnoreCase("remove"))
        {
            Students.remove(student);
        }
        else {
            System.out.println("Invalid");
        }

    }

    @Override
     public String toString(){
        return super.toString() + "\n========Student Info========= = " + Students ;
    }
}



