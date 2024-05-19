package project.project;

// Abstract class representing a generic person in the system
public abstract class Person {
    // Field to store the name of the person
    private String name;

    // Constructor to initialize the Person object with a name
    public Person(String name) {
        this.name = name;
    }

    // Getter method to access the private name field
    public String getName() {
        return name;
    }
}
