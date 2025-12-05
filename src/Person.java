public abstract class Person {
    private String id, name, eMail;

    protected Person(String id, String name, String eMail){
        this.id = id;
        this.name = name;
        this.eMail = eMail;
    }
    @Override
    public String toString(){
        return ("\nId = "+id+"\nName = "+name+"\nE-Mail ="+eMail);
    }
    @Override
    public boolean equals(Object o) {
        // If the object is not a Person, it's obviously not equal
        if (!(o instanceof Person)) return false;

        Person other = (Person) o;

        // Two persons are equal if their IDs match
        return this.id.equals(other.id);
    }

    public abstract String getRole();//ABSTRACT method

    // Getters
    public String getId() {
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
