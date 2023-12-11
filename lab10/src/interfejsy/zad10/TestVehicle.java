package interfejsy.zad10;

import java.util.ArrayList;

public class TestVehicle {

    public static void main(String[] args) {
        ArrayList<VehicleManager> list = new ArrayList<>();
        list.add(new Car());
        list.add(new Car());
        list.add(new Motorcycle());
        list.add(new Motorcycle());
        for(var elem: list){
            System.out.println(elem.startEngine());
        }
    }
}
