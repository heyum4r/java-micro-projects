import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        BankAccount account = new BankAccount();
        BankManager manager = new BankManager();

        while (true) {

            // account creation

            System.out.println("-------Create Your Account----------");
            System.out.println("Enter your name:");
            String userName = scan.nextLine();
            account.setName(userName);
            manager.accountCreation(account);
            System.out.println();

            System.out.println("-------Which operation Want to perform--------");
            System.out.println("(1) Deposit \n(2) Withdrew \n(3) Transfer \n(4) Check Balance \n(5) Exit → \n");
            System.out.println("Enter your choice: ");
            int userInput = scan.nextInt();
            scan.nextLine();

            switch (userInput) {

                case 1:
                    String userInputAcNumber;
                    while (true) {
                        System.out.println("Enter your Account Number Want to Deposit:");
                        userInputAcNumber = scan.nextLine();

                        if (manager.isAccountFound(userInputAcNumber)) {
                            System.out.println("Enter Deposit Amount: ");
                            double deposit = scan.nextDouble();
                            manager.deposit(account, deposit);
                            break;

                        } else {
                            System.out.println("User Account Not found! try Again");
                        }

                    }
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