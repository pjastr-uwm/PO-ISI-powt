package interfejsy.zad10;

public class Motorcycle implements VehicleManager{
    @Override
    public String startEngine() {
        return "Silnik motocykla uruchomiony";
    }

    @Override
    public int getFuelLevel() {
        return 30;
    }
}
