package BankingSystem;

// Main Class
public class Main {
    public static void main(String[] args) {
        // Create SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount("Anthony Gudu", "SA12345", 500, 3);

        // Create CurrentAccount
        CurrentAccount currentAccount = new CurrentAccount("Anthony Gudu", "CA54321", 1000, 500);

        // Deposit operations
        System.out.println("\nSavings Account Deposit: ");
        savingsAccount.deposit(200);
        savingsAccount.deposit(300, "Salary credited.");

        System.out.println("\nCurrent Account Deposit:");
        currentAccount.deposit(500);
        currentAccount.deposit(400, "Project payment received.");

        // Withdraw operations
        System.out.println("\nSavings Account Withdrawal:");
        savingsAccount.withdraw(450); // Test minimum balance

        System.out.println("\nCurrent Account Withdrawal:");
        currentAccount.withdraw(1300); // Test overdraft limit
        currentAccount.withdraw(2000); // Exceed overdraft limit

        // Display account details
        System.out.println("\nAccount Details: ");
        savingsAccount.displayAccountDetails();
        savingsAccount.calculateInterest();

        System.out.println();
        currentAccount.displayAccountDetails();
    }

    static class SavingsAccount extends BankAccount {
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
}
