public class TestBankAccount {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        System.out.println(b1.balance);
        b1.deposit(300);
        System.out.println(b1.balance);
        b1.withdraw(150);
        System.out.println(b1.balance);
    }
}

class BankAccount{
    double balance;

    void deposit(double amount){
        balance += amount;
    }

    void withdraw(double amount){
        balance -= amount;
    }
}
