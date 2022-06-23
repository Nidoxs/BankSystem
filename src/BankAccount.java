public class BankAccount {
    static int currentAutoIncrementID = 0;
    int accountId;
    String firstName;
    String lastName;
    float balance;

    public BankAccount(String firstName, String lastName, int startingBalance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = Math.max(startingBalance, 0);
    }

    public float getBalance() {
        return balance;
    }


    public void deposit(float depositAmount) {
        this.balance += depositAmount;
    }

    public String withdraw(float withdrawAmount) {
        if(this.balance < withdrawAmount) {
            return "You do not have enough money to withdraw that amount.";
        } else {
            this.balance -= withdrawAmount;
            return String.format("£%f has been withdrawn from your account.", this.balance);
        }
    }
}
