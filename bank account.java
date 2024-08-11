import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
import entities.Account;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.println("Enter account holder: ");
        String holder = sc.next();
        System.out.print("Is there an initial deposit (yes/no)? ");
        String yORn = sc.next();
        if (Objects.equals(yORn, "yes")) {
            System.out.print("Enter initial deposit value: ");
            double amount = sc.nextDouble();
            Account account = new Account(number, holder, amount);
            account.InitialDeposit(amount);
            System.out.print(account.toString());
            System.out.print("\nEnter a deposit value: ");
            amount = sc.nextDouble();
            account.Deposit(amount);
            System.out.print(account.toString2());
            System.out.print("\nEnter a withdraw value: ");
            amount = sc.nextDouble();
            account.Withdraw(amount);
            System.out.print(account.toString2());
        } else if (Objects.equals(yORn, "no")) {
            Account account = new Account(number, holder);
            System.out.print(account.toString());
            System.out.print("\nEnter a deposit value: ");
            double amount = sc.nextDouble();
            account.Deposit(amount);
            System.out.print(account.toString2());
            System.out.print("\nEnter a withdraw value: ");
            amount = sc.nextDouble();
            account.Withdraw(amount);
            System.out.print(account.toString2());

        }
        }
}
