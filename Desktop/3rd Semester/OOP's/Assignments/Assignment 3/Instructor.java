public class Instructor extends Person{
    private String department;
    private double officeHours;

    Instructor (int id, String name, String eMail, String department, double officeHours){
        super(id, name, eMail);
        this.department = department;
        this.officeHours = officeHours;
    }
    
    @Override
    public void displayInfo(){
        
    }

    
}
