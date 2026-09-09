class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than 0.");
        } 
        else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } 
        else {
            balance = balance - amount;
            System.out.println("Withdrawn: ₹" + amount);
        }
    }

    double getBalance() {
        return balance;
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: ₹" + balance);
    }
}

public class Practical02 {

    public static void main(String[] args) {

        BankAccount account =
                new BankAccount("123456789", "Shivi", 10000);

        account.displayAccount();

        account.deposit(5000);

        account.withdraw(3000);

        System.out.println("Current Balance: ₹" + account.getBalance());

        account.withdraw(20000);

        account.deposit(-500);
    }
}