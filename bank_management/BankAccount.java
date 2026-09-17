public class BankAccount {
    private double balance;
    private String name;
    private String accountNumber;
    private double openingBalance;

    // getter
    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getopeningBalance() {
        return openingBalance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    public void setBalance(double balance) {
         this.balance = balance;
    }

    @Override
    public String toString() {
        return "Name: '" + name +
               "' Account: '" + accountNumber +
               "' Blance: '" + openingBalance + "'";
    }

}
