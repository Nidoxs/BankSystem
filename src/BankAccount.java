public class BankAccount {
    static int currentAutoIncrementID = 0;
    int accountId;
    String firstName;
    String lastName;
    double balance;

    public BankAccount(String firstName, String lastName, double startingBalance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = Math.max(startingBalance, 0);
    }

    public double getBalance() {
        return balance;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
    }

    public String withdraw(double withdrawAmount) {
        if(this.balance < withdrawAmount) {
            return "You do not have enough money to withdraw that amount.";
        } else {
            this.balance -= withdrawAmount;
            return String.format("£%f has been withdrawn from your account.", this.balance);
        }
    }
}
