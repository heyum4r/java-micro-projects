public class BankManager {

    // Deposit money
    public void deposit(BankAccount balance, double amount) {
        if (amount > 0) {
            double newBalance = balance.getBalance() + amount; // ?
            balance.setBalance(newBalance);
            System.out.println("Balance added " + amount + " succesfully");

        }else {
            System.out.println("Can't be add balance less than 1");

        }

    }

    // Withdraw
    public void withdraw(BankAccount balance, double amount) {
        if (balance.getBalance() >= amount) {
            double leftBalance = balance.getBalance() - amount;
            balance.setBalance(leftBalance);
            System.out.println("Balance withdrew " + amount + " succesfully");

        } else {

            System.out.println("Can't withdraw low Balance!");
        }
    }

    // Transfer
    public void transfer(BankAccount balance, double amount) {
        if (balance.getBalance() > amount) {
            double transferBalance = balance.getBalance() - amount;
            balance.setBalance(transferBalance);
            System.out.println("Balance Transfer " + amount + " succesfully");

        } else {
            System.out.println("Can't Transfer low Balance!");

        }

    }

    // Check
    public void checkBalance(BankAccount balance) {
        System.out.println("Your avilable balance is: " + balance.getBalance());

    }
}