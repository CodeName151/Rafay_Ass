
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException{
        Person s1 = new Student(1, "Shayan", "Shampoo@sunsilk.com", "Cs", 2012);
        // Person s2 = new Student(2, "Rafat", "poo@sunsilk.com", "Cs", 2012);
        Person s3 = s1.clone();
        s1.displayInfo();
        s3.displayInfo();
        s3.setName("Ali");
        s3.displayInfo();

    }
}
