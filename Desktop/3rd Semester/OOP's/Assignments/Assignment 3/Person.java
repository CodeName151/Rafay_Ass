
public abstract class Person {
    private String name, eMail;
    private int id;

    protected Person(int id, String name, String eMail){
        this.id = id;
        this.name = name;
        this.eMail = eMail;
    }
    @Override
    public String toString(){
        return ("Id = "+id+", Name = "+name+", E-Mail = "+eMail);
    }
    @Override
    public boolean equals(Object o) {
    // If the object is not a Person, it's obviously not equal
    if (o instanceof Person){
        Person other = (Person) o;

    // Two persons are equal if their IDs match
    return this.id == other.id;
    }
    else
    return false;
    
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        // super.clone() does the actual shallow cloning
        return (Person) super.clone();
    }
    //ABSTRACT method
    public abstract void displayInfo();

// Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return eMail;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.eMail = email;
    }
}



