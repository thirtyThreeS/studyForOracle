public class BankAccount
{
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private double phoneNumber;


    public BankAccount(int accountNumber, double balance, String customerName, String email, double phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void getBalance() {
        System.out.println("Your current balance is $" + String.format("%.2f", balance));
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double depositFunds(double depositAmount)
    {
        System.out.println("Your new account balance is $" + (this.balance + depositAmount));

        this.balance += depositAmount;

        return this.balance + depositAmount;
    }

    public void withdrawFunds(double withdrawAmount)
    {
        if (balance - withdrawAmount < 0)
        {
            System.out.println("Not enough funds for withdrawal..");
        }

        else balance -= withdrawAmount;

        System.out.println("Your new account balance is $" + balance);
    }
}
