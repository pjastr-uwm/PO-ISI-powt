package rekordy.zad10;

public class TestBanAccount {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(3445, 2000.34);
        BankAccount b2 = new BankAccount(3445);
        System.out.println(b1);
        System.out.println(b2);
    }
}
