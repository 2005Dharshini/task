public class BankAccount {
    private double balance;

    
    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            System.out.println("Initial balance can't be negative. Setting balance to 0.");
            this.balance = 0;
        } else {
            this.balance = initialBalance;
        }
    }

   
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public double getBalance() {
        return balance;
    }

  
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); 
        account.displayBalance();

        account.deposit(500);
        account.displayBalance();

        account.withdraw(300);
        account.displayBalance();

        account.withdraw(1500);  
    }
}
