package zlozone.zad2listatab;

import java.util.ArrayList;
import java.util.Arrays;

public class TestBook {

    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList<>();
        lista.add(4.5);
        lista.add(3.4);
        Book b1 = new Book("AA", "XX", lista);
        System.out.println(b1);
    }
}
