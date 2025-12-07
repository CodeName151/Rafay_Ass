public class Student extends Person implements Comparable<Person>, Cloneable {
    private String major;
    private int year;

    public Student(int id, String name, String eMail, String major, int year) {
        super(id, name, eMail);
        this.major = major;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student["+super.toString() + ", Major = " + major + ", Year = " + year+"]";
    }

  

    // fixed: compare primitive ints using Integer.compare
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.getId(), other.getId());
    }

    @Override
    public Student clone() throws CloneNotSupportedException{
        return (Student) super.clone();
    }

    // implement abstract method from Person
    @Override
    public void displayInfo() {
        System.out.println("Name = "+getName());
        System.out.println("Id = "+getId());
        System.out.println("E-Mail = "+getEmail());
        System.out.println("Major = "+major);
        System.out.println("Year = "+year);
    }

    // Getters
    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    // Setters
    public void setMajor(String major) {
        this.major = major;
    }

    public void setYear(int year) {
        this.year = year;
    }
}