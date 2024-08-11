package entities;

public class Account{
    public int number;
    public String holder;
    public double balance;

    public Account(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;

    }
    public void InitialDeposit(double amount){
        amount += balance;
    }

    public void Deposit(double amount){
        balance += amount;
    }
    public void Withdraw(double amount){
        balance -= (amount + 5);
    }

    public String toString(){
        return "Account data:\n" + "Account "+ number + ", Holder: " + holder + ", Balance: $" + balance
    ;}
    public String toString2(){
        return "Updated Account data:\n" + "Account "+ number + ", Holder: " + holder + ", Balance: $ " + balance
                ;}
}
