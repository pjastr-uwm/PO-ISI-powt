package kompator.zad3;

import java.util.Comparator;

public class ProductionYearComparator implements Comparator<Car> {
    @Override
    public int compare(Car obj1, Car obj2) {
        return Integer.compare(obj1.getProductionYear(), obj2.getProductionYear());
    }
}
