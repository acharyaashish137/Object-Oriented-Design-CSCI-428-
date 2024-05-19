package project.project;

//Extends Person to include student-specific attributes.
public class Student extends Person {
    private int age; // Student's age

    //Constructs a student with name and age.
    public Student(String name, int age) {
        super(name); // Delegate name initialization to the superclass
        this.age = age;
    }


    public int getAge() {
        return age; // return student age
    }
}
