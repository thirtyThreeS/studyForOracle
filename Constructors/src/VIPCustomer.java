public class VIPCustomer
{
    private String name;
    private double creditLimit;
    private String email;

    public VIPCustomer() {
        this("Default Name", 500.00, "default@gmail.com");
    }

    public VIPCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@gmail.com");
    }

    public VIPCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
