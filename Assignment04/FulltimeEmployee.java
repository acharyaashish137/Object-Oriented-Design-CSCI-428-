package assignment04Qn1;

import java.util.Date;

public class FulltimeEmployee extends Person {
    private String office; // Office location
    private double salary; // Annual salary
    private Date dateHired; // Date when the employee was hired

    // Constructor
    public FulltimeEmployee(String name, String address, String phoneNumber, String emailAddress,
                            String office, double salary, Date dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    // Accessor and mutator for office
    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    // Accessor and mutator for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Accessor and mutator for dateHired
    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    // toString method to provide a string representation of the object
    @Override
    public String toString() {
        return super.toString() + ", FulltimeEmployee{" +
               "office='" + office + '\'' +
               ", salary=" + salary +
               ", dateHired=" + dateHired +
               '}';
    }
}

