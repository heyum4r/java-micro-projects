import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        BankAccount account = new BankAccount();
        BankManager manager = new BankManager();

        while (true) {
            System.out.println("\n(1) Deposit \n(2) Withdrew \n(3) Transfer \n(4) Check Balance \n(5) Exit → \n");
            System.out.println("Enter your choice: ");
            int userInput = scan.nextInt();

            switch (userInput) {

                case 1:
                    System.out.println("Enter Deposit Amount: ");
                    double deposit = scan.nextDouble();
                    manager.deposit(account, deposit);
                    break;

                case 2:
                    System.out.println("Enter Withdraw Amount: ");
                    double withdraw = scan.nextDouble();
                    manager.withdraw(account, withdraw);
                    break;

                case 3:
                    System.out.println("Enter Transfer Amount: ");
                    double transfer = scan.nextDouble();
                    manager.transfer(account, transfer);
                    break;

                case 4:
                    manager.checkBalance(account);
                    break;
                case 5:
                    System.out.println("Program Closed...");
                    return;

                default:
                    System.out.println("Enter a valid Number.");
                    break;

            }
        }

    }
}