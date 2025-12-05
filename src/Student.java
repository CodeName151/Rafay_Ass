class Student extends Person implements Comparable<Person>, Cloneable{
    private String major;
    private int year;
    public Student(String id, String name, String eMail, String major, int year){
        super(id, name, eMail);
        this.major = major;
        this.year = year;
    }

    @Override
    public String toString(){
        return super.toString() + "\nMajor = " + major + "\nYear = " + year;
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
    public Student clone() {
        return new Student(this.getId(), this.getName(), this.getEmail(), this.major, this.year);
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
        this.year=year;
}
}