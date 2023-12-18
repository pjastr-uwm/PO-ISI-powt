package kompator.zad3;

public class Car {

    private String brand;
    private int productionYear;
    private double price;

    public Car(String brand, int productionYear, double price) {
        this.brand = brand;
        this.productionYear = productionYear;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", productionYear=" + productionYear +
                ", price=" + price +
                '}';
    }

    public int getProductionYear() {
        return productionYear;
    }
}
