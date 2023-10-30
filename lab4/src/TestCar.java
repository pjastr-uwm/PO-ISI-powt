public class TestCar {

    public static void main(String[] args) {
        int[] tablica = new int[3];
        Car[] samochody = new Car[3];
        samochody[0] = new Car();
        samochody[0].brand = "skoda";
    }
}

class Car{
    public String brand;
}
