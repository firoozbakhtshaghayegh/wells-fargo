import java.time.LocalDate;
import java.util.List;

public class Portfolio {
    private String portfoliold;
    private String name;
    private String clientId;
    private LocalDate creationDate;
    private List<Security> securities;

    // constructor, getters, and setters for each field

    // constructor with required parameters
    public Portfolio(String portfoliold, String name, String clientId, LocalDate creationDate) {
        this.portfoliold = portfoliold;
        this.name = name;
        this.clientId = clientId;
        this.creationDate = creationDate;
    }

    // getter for portfoliold
    public String getPortfoliold() {
        return portfoliold;
    }

    // setter for portfoliold
    public void setPortfoliold(String portfoliold) {
        this.portfoliold = portfoliold;
    }

    // getter for name
    public String getName() {
        return name;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    // getter for clientId
    public String getClientId() {
        return clientId;
    }

    // setter for clientId
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    // getter for creationDate
    public LocalDate getCreationDate() {
        return creationDate;
    }

    // setter for creationDate
    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    // getter for securities
    public List<Security> getSecurities() {
        return securities;
    }

    // setter for securities
    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }
}