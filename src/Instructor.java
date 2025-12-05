public class Instructor extends Person implements Comparable<Person> , Cloneable {

    private String department;
    private double officeHours;
    public Instructor(String id, String name, String eMail , String Department , double officeHours)
            {
        super(id, name, eMail);
        this.officeHours = officeHours;
        this.department =  department;
    }

    @Override
    public String toString(){
        return super.toString() + "\nDepartment = " + department + "\nofficeHours = " + officeHours;
    }

    @Override
    public String getRole(){
        return "Student";
    }

    @Override
    public int compareTo(Person other) {
        return this.getName().compareTo(other.getName());
    }

    @Override
    public Instructor clone() {
        return new Instructor(this.getId(), this.getName(), this.getEmail(), this.department, this.officeHours);
    }

    public double getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(double officeHours) {
        this.officeHours = officeHours;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
