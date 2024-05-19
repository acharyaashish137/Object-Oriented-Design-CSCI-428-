package assignment04Qn1;

import java.util.Date;

public class Junior extends FulltimeEmployee {
    private String mentor;
    private String rank;

    // Constructor
    public Junior(String name, String address, String phoneNumber, String emailAddress,
                  String office, double salary, Date dateHired,
                  String mentor, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.mentor = mentor;
        this.rank = rank;
    }

    // Accessor and mutator for mentor
    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    // Accessor and mutator for rank
    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    // toString method to provide a string representation of the object
    @Override
    public String toString() {
        return "Junior{" + "name=" + getName() + ", mentor=" + mentor + ", rank=" + rank + '}';
    }
}

