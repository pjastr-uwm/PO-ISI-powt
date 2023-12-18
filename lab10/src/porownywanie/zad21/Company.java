package porownywanie.zad21;

public class Company extends Client implements Comparable<Client>{

    private int numberOfEmployees;

    public Company(String lastName, double balance, int numberOfEmployees) {
        super(lastName, balance);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", numberOfEmployees=" + numberOfEmployees;
    }

    @Override
    public int compareTo(Client obj){
        if (obj instanceof Company){
            Company temp = (Company) obj;
            int base = super.compareTo(temp);
            if (base!=0)
                return base;
            return Integer.compare(this.numberOfEmployees, temp.numberOfEmployees);
        }
        return super.compareTo(obj);
    }


}
