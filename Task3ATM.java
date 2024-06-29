import java.util.Scanner;

public class Task3ATM {
    private Task3BankAccount account;
    private Scanner scanner;

    public Task3ATM(Task3BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        int option = 0;
        do {
            System.out.println("ATM Menu:");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid option.Please try again.");
            }
        } while (option != 4);
    }

    private void checkBalance() {
        System.out.println("Current Balance: " + account.getBalance());
    }

    private void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount > 0 && account.deposit(amount)) {
            System.out.println("Successfully deposited " + amount);
        } else {
            System.out.println("Invalid amount.Deposit failed.");
        }
    }

    private void withdraw() {
        System.out.print("Enter amount to withdraw:");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= account.getBalance() && account.withdraw(amount)) {
            System.out.println("Successfully withdraw " + amount);
        } else {
            System.out.println("Insufficient balance.Withdrawal failed.");
        }
    }

    public static void main(String[] args) {
        Task3BankAccount account = new Task3BankAccount(500.0);
        Task3ATM atm = new Task3ATM(account);
        atm.displayMenu();
    }
}
