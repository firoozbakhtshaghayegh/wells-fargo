import java.time.LocalDate;

public class Client {
    private String clientId;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phone;
    private LocalDate creationDate;

    // constructor, getters, and setters for each field

    // constructor with required parameters
    public Client(String clientId, String firstName, String lastName, String email, String address, String phone, LocalDate creationDate) {
        this.clientId = clientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.creationDate = creationDate;
    }

    // getter for clientId
    public String getClientId() {
        return clientId;
    }

    // setter for clientId
    public void setClientId(String clientId) {
        this.clientId = clientId;
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

    // getter for email
    public String getEmail() {
        return email;
    }

    // setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // getter for address
    public String getAddress() {
        return address;
    }

    // setter for address
    public void setAddress(String address) {
        this.address = address;
    }

    // getter for phone
    public String getPhone() {
        return phone;
    }

    // setter for phone
    public void setPhone(String phone) {
        this.phone = phone;
    }

    // getter for creationDate
    public LocalDate getCreationDate() {
        return creationDate;
    }

    // setter for creationDate
   