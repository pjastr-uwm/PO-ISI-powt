package porownywanie.zad21;

public class Client implements Comparable<Client>{

    private String lastName;
    private double balance;

    public Client(String lastName, double balance) {
        this.lastName = lastName;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                ": lastName=" + lastName  +
                ", balance=" + balance;
    }

    @Override
    public int compareTo(Client obj) {
        int base = Double.compare(this.balance, obj.balance);
        if (base!=0){
            return base;
        }
        return this.lastName.compareTo(obj.lastName);
    }
}
