public class Student {
    //Attribute
    private String name;
    private String lastName;

    // Konstruktor
    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    // Methoden
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
