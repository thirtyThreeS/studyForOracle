// Small Logical Bug of 100.0 instead of 100.00
// Don't remember how to implement %.2f -> Check into it later

// Can use String.format("%.2f", double/float number) within sout statement. Also, there is something called DecimalFormat object that I am currently unaware of proper use for it.
// String.format should be the goto for now I would assume because the code is as clunky as calling in another object. // shrugs -> view getBalance() vs everything else

public class Main {
    public static void main(String[] args) {
        BankAccount alex = new BankAccount(101,0,"Alex Smith", "alexsmith@outlook.com", 5555555);
        alex.getBalance();
        System.out.println(alex.depositFunds(500));
        alex.withdrawFunds(600);
        alex.getBalance();
        alex.withdrawFunds(400);
        alex.getBalance();

        VIPCustomer vip = new VIPCustomer();
        System.out.println(vip.getCreditLimit());
        System.out.println(vip.getEmail());
        System.out.println(vip.getName());
    }
}