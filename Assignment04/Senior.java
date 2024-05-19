package assignment04Qn1;

import java.util.Date;
import java.util.List;

public class Senior extends FulltimeEmployee {
    private List<Junior> teamOfJuniors; // Assuming we're using a list to hold the team members
    private double companyStock;

    // Constructor
    public Senior(String name, String address, String phoneNumber, String emailAddress,
                  String office, double salary, Date dateHired,
                  List<Junior> teamOfJuniors, double companyStock) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.teamOfJuniors = teamOfJuniors;
        this.companyStock = companyStock;
    }

    // Accessor and mutator for teamOfJuniors
    public List<Junior> getTeamOfJuniors() {
        return teamOfJuniors;
    }

    public void setTeamOfJuniors(List<Junior> teamOfJuniors) {
        this.teamOfJuniors = teamOfJuniors;
    }

    // Accessor and mutator for companyStock
    public double getCompanyStock() {
        return companyStock;
    }

    public void setCompanyStock(double companyStock) {
        this.companyStock = companyStock;
    }

    // toString method to provide a string representation of the object
    @Override
    public String toString() {
        return "Senior{" + "name=" + getName() + ", teamOfJuniors=" + teamOfJuniors.size() +
               ", companyStock=" + companyStock + '}';
    }
}
