import pl.edu.uwm.zad2.Vehicle;

public class TestVehicle {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Skoda", null, 2012);
        System.out.println(v1);
        Vehicle v2 = new Vehicle("Skoda", null, 2012);
        System.out.println(v1 == v2); // java zawsze ten sam kontekst
        System.out.println(v1.equals(v2)); // mozliwy inny kontekst
        System.out.println(v1.hashCode() == v2.hashCode());
    }
}
