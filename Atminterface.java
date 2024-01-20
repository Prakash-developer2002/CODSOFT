import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public double checkBalance() {
        return balance;
    }
}

class ATM {
    private BankAccount userAccount;

    public ATM(BankAccount userAccount) {
        this.userAccount = userAccount;
    }

    public void displayMenu() {
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Quit");
    }

    public void withdraw(double amount) {
        if (userAccount.withdraw(amount)) {
            System.out.println("Withdrawal successful. New balance: $" + userAccount.checkBalance());
        } else {
            System.out.println("Withdrawal failed. Insufficient funds.");
        }
    }

    public void deposit(double amount) {
        if (userAccount.deposit(amount)) {
            System.out.println("Deposit successful. New balance: $" + userAccount.checkBalance());
        } else {
            System.out.println("Deposit failed. Please deposit a positive amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: $" + userAccount.checkBalance());
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            System.out.print("Enter your choice (1-4): ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter the withdrawal amount: $");
                    double withdrawalAmount = Double.parseDouble(scanner.nextLine());
                    withdraw(withdrawalAmount);
                    break;
                case "2":
                    System.out.print("Enter the deposit amount: $");
                    double depositAmount = Double.parseDouble(scanner.nextLine());
                    deposit(depositAmount);
                    break;
                case "3":
                    checkBalance();
                    break;
                case "4":
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

        public static void main(String[] args) {
            private class Atminterface(){
                BankAccount userAccount = new BankAccount(1000);
            ATM atmMachine = new ATM(userAccount);
            atmMachine.run();

            }
            
        }

}