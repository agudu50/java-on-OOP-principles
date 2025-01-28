package BankingSystem;

public abstract class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;


    //Constructor
    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    //Deposit methods (method for overloading)
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited successfully. New balance is: " + "GHS" + balance);
    }

    public void deposit(double amount, String transactionNote) {
        balance += amount;
        System.out.println("Deposited successfully. " + transactionNote + " New balance is:" + "GHS" +balance );
    }

    //Withdraw method
    public void withdraw(double amount) {
        if (amount >= balance) {
            balance -= amount;
            System.out.println("Withdraw successfully. New balance is: " + "GHS" + + balance);
        } else {
            System.out.println("Insufficient funds");
        }

    }

    //Displaying account details
    public void dispplayAccountDetails() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " +  "GHS" + balance);
    }


    //Getter for balance (to be used in subclasses)
    protected double getBalance() {
        return balance;
    }

    //Setter for balance (to be used in subclasses)
    protected void setBalance(double balance) {
        this.balance = balance;
    }

    //Override displayAccountDetails
    public void displayAccountDetails() {
    }


    public abstract void displayAccounDetails();
}
