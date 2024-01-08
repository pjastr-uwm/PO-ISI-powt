package kolekcje.zadA1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestA1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(-12);
        list.add(-12);
        list.add(5);
        printUnique(list);
    }

    public static <T> void printUnique(Collection<T> items){
        HashSet<T> h1 = new HashSet<>(items);
        for(var element: h1){
            System.out.println(element);
        }
    }
}
