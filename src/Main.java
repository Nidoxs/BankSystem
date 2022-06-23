public class Main {
    static String balanceString = "%s balance is £";
    public static void main(String[] args) {
        BankAccount accountOne = new BankAccount("Benjamin", "Hardman", 1000);
        BankAccount accountTwo = new BankAccount("Lateefah", "Ahmad", 7500);

        String balanceStringOne = String.format(balanceString, accountOne.getFullName()) + accountOne.getBalance();
        String balanceStringTwo = String.format(balanceString, accountTwo.getFullName()) + accountTwo.getBalance();

        System.out.println(balanceStringOne);
        System.out.println(balanceStringTwo);
    }
}
