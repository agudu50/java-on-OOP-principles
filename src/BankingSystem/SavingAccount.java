package BankingSystem;

class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountHolderName, String accountNumber, double balance, double interestRate) {
        super(accountHolderName, accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Override withdraw method
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 100) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal successful. New balance: " + getBalance());
        } else {
            System.out.println("Minimum balance requirement not met.");
        }
    }

    // Calculate interest
    public void calculateInterest() {
        double interest = getBalance() * (interestRate / 100);
        System.out.println("Annual Interest: " + interest);
    }

    // Override displayAccountDetails
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    @Override
    public void displayAccounDetails() {

    }
}

