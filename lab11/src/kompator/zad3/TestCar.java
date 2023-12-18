package kompator.zad3;

import java.util.Arrays;

public class TestCar {

    public static void main(String[] args) {
        Car[] tab = new Car[5];
        tab[0] = new Car("AA", 2003, 1234);
        tab[1] = new Car("BB", 2012, 545);
        tab[2] = new Car("CC", 2005, 656576);
        tab[3] = new Car("DD", 2006, 5465);
        tab[4] = new Car("AA", 2003, 545);
        for (var elem:tab){
            System.out.println(elem);
        }
        Arrays.sort(tab, new ProductionYearComparator());
        System.out.println("After sort");
        for (var elem:tab){
            System.out.println(elem);
        }
    }
}
