package assignment04Qn1;

public class ParttimeEmployee extends Person {
    // Constants for class status
    public static final String REGULAR = "regular";
    public static final String SEASONAL = "seasonal";
    public static final String ON_CALL = "on-call";
    public static final String CONTRACTOR = "contractor";

    private String classStatus; // Holds the employment status
    private double payRate; // Pay rate for the part-time employee

    // Constructor
    public ParttimeEmployee(String name, String address, String phoneNumber, String emailAddress,
                            String classStatus, double payRate) {
        super(name, address, phoneNumber, emailAddress);
        this.classStatus = classStatus;
        this.payRate = payRate;
    }

    // Accessor and mutator for classStatus
    public String getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(String classStatus) {
        this.classStatus = classStatus;
    }

    // Accessor and mutator for payRate
    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    // toString method to provide a string representation of the object
    @Override
    public String toString() {
        return super.toString() + ", ParttimeEmployee{" +
               "classStatus='" + classStatus + '\'' +
               ", payRate=" + payRate +
               '}';
    }
}
