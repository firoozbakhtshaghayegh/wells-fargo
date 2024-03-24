import java.time.LocalDate;

public class Security {
    private String securityld;
    private String name;
    private String advisorId;
    private String clientId;
    private double purchasePrice;
    private LocalDate purchaseDate;
    private int quantity;
    private Advisor advisor;
    private Client client;

    // constructor, getters, and setters for each field

    // constructor with required parameters
    public Security(String securityld, String name, String advisorId, String clientId, double purchasePrice, LocalDate purchaseDate, int quantity) {
        this.securityld = securityld;
        this.name = name;
        this.advisorId = advisorId;
        this.clientId = clientId;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    // getter for securityld
    public String getSecurityld() {
        return securityld;
    }

    // setter for securityld
    public void setSecurityld(String securityld) {
        this.securityld = securityld;
    }

    // getter for name
    public String getName() {
        return name;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    // getter for advisorId
    public String getAdvisorId() {
        return advisorId;
    }

    // setter for advisorId
    public void setAdvisorId(String advisorId) {
        this.advisorId = advisorId;
    }

    // getter for clientId
    public String getClientId() {
        return clientId;
    }

    // setter for clientId
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    // getter for purchasePrice
    public double getPurchasePrice() {
        return purchasePrice;
    }

    // setter for purchasePrice
    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    // getter for purchaseDate
    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    // setter for purchaseDate
    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    // getter for quantity
    public int getQuantity() {
        return quantity;
    }

    // setter for quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // getter for advisor
    public Advisor getAdvisor() {
        return advisor;
    }

    // setter for advisor
    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    // getter for client
    public Client getClient() {
        return client;
    }

    // setter for client
    public void setClient(Client client) {
        this.client = client;
    }
}