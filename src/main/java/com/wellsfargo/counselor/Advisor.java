import java.time.LocalDate;

public class Advisor {
    private String advisorId;
    private String firstName;
    private String lastName;
    private LocalDate creationDate;

    // constructor, getters, and setters for each field

    // constructor with required parameters
    public Advisor(String advisorId, String firstName, String lastName, LocalDate creationDate) {
        this.advisorId = advisorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.creationDate = creationDate;
    }

    // getter for advisorId
    public String getAdvisorId() {
        return advisorId;
    }

    // setter for advisorId
    public void setAdvisorId(String advisorId) {
        this.advisorId = advisorId;
    }

    // getter for firstName
    public String getFirstName() {
        return firstName;
    }

    // setter for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // getter for lastName
    public String getLastName() {
        return lastName;
    }

    // setter for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // getter for creationDate
    public LocalDate getCreationDate() {
        return creationDate;
    }

    // setter for creationDate
    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
}