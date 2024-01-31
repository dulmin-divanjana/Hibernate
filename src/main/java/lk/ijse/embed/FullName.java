package lk.ijse.embed;

import jakarta.persistence.Embeddable;

@Embeddable
public class FullName {
    private String firstName;
    private String secondName;

    @Override
    public String toString() {
        return "FullName{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public FullName() {
    }

    public FullName(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }
}
