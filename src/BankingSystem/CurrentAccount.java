package BankingSystem;

// Subclass: CurrentAccount
class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    // Constructor
    public CurrentAccount(String accountHolderName, String accountNumber, double balance, double overdraftLimit) {
        super(accountHolderName, accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Override withdraw method
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= -overdraftLimit) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal successful. New balance: " + getBalance());
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }

    // Override displayAccountDetails
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }

    @Override
    public void displayAccounDetails() {

    }
}
