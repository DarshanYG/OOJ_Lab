import java.util.Scanner;

class Bank_Account {
    private String customerName;
    private String accountNumber;
    private String accountType;
    protected double balance;

    public Bank_Account(String customerName, String accountNumber, String accountType) {
        this.customerName = customerName; // Corrected variable names
        this.accountNumber = accountNumber; // Corrected variable names
        this.accountType = accountType;
        this.balance = 0.0; 
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

class Sav_acct extends Bank_Account {
    private double interestRate;

    public Sav_acct(String customerName, String accountNumber, double interestRate) {
        super(customerName, accountNumber, "Savings");
        this.interestRate = interestRate;
    }

    public void computeAndDepositInterest() {
        double interest = balance * interestRate / 100;
        deposit(interest);
        System.out.println("Interest deposited: " + interest);
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

class Curr_acct extends Bank_Account {
    private double minimumBalance;
    private double serviceCharge;

    public Curr_acct(String customerName, String accountNumber, double minimumBalance, double serviceCharge) {
        super(customerName, accountNumber, "Current"); // Corrected constructor parameter names
        this.minimumBalance = minimumBalance; // Corrected variable name
        this.serviceCharge = serviceCharge;
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= minimumBalance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds. Imposing service charge.");
            balance -= serviceCharge;
            System.out.println("Service charge applied: " + serviceCharge);
        }
    }
}

public class MyBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        System.out.println("Name-Darshan, USN-1BM23CS087");

        Sav_acct savingsAccount = new Sav_acct("Darshan", "11087", 5);
        Curr_acct currentAccount = new Curr_acct("Danish", "11069", 100, 50);

        int choice;
        do {
            System.out.println("\nBank Menu:");
            System.out.println("1. Deposit (Sav_acct)");
            System.out.println("2. Withdraw (Sav_acct)");
            System.out.println("3. Compute Interest (Sav_acct)");
            System.out.println("4. Display Balance (Sav_acct)");
            System.out.println("5. Deposit (Curr_acct)");
            System.out.println("6. Withdraw (Curr_acct)");
            System.out.println("7. Display Balance (Curr_acct)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount for Savings Account: ");
                    double savDeposit = scanner.nextDouble();
                    savingsAccount.deposit(savDeposit); // Corrected method call
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount for Savings Account: ");
                    double savWithdraw = scanner.nextDouble();
                    savingsAccount.withdraw(savWithdraw);
                    break;
                case 3:
                    savingsAccount.computeAndDepositInterest();
                    break;
                case 4:
                    savingsAccount.displayBalance();
                    break;
                case 5:
                    System.out.print("Enter deposit amount for Current Account: ");
                    double curDeposit = scanner.nextDouble();
                    currentAccount.deposit(curDeposit);
                    break;
                case 6:
                    System.out.print("Enter withdrawal amount for Current Account: ");
                    double curWithdraw = scanner.nextDouble();
                    currentAccount.withdraw(curWithdraw);
                    break;
                case 7:
                    currentAccount.displayBalance();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
