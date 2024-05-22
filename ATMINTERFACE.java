import java.util.Scanner;
class UserBankAccount {
    private double balance;

    public UserBankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Successfully. Your new balance is: RS " + balance);
        } else {
            System.out.println("Invalid Deposit amount. Please try again.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful. Your new balance is: RS " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Your balance is: RS " + balance);
        } else {
            System.out.println("Invalid Withdrawal amount. Please try again.");
        }
    }
}
class ATM {
    private UserBankAccount account;

    public ATM(UserBankAccount account) {
        this.account = account;
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("ATM MENU :");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Please Choose an option: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    System.out.println("Thankyou for using the ATM. Have a Great Time!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again Sir/Madam.");
            }
        } while (choice != 4);
        scanner.close();
    }

    private void checkBalance() {
        System.out.println("Your current balance is: RS " + account.getBalance());
    }

    private void deposit(Scanner scanner) {
        System.out.print("Enter the deposit amount: RS ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
    }

    private void withdraw(Scanner scanner) {
        System.out.print("Enter the  withdrawal amount: RS ");
        double amount = scanner.nextDouble();
        account.withdraw(amount);
    }
}
public class ATMINTERFACE {
    public static void main(String[] args) {
        UserBankAccount account = new UserBankAccount( 5000); 
        ATM atm = new ATM(account);
        atm.displayMenu();
    }

    @Override
    public String toString() {
        return "ATMINTERFACE []";
    }
}
