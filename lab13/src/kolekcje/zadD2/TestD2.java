package kolekcje.zadD2;

import java.util.LinkedList;
import java.util.List;

public class TestD2 {

    public static void main(String[] args) {
        Alg a1 = new Alg();
        LinkedList<Integer> list1 = new LinkedList<>(List.of(4,-5,7,8,10));
        LinkedList<Integer> list2 = new LinkedList<>(List.of(12,10, -5, 44, 50));
        LinkedList<Integer> result = a1.findCommonElements(list1, list2);
        System.out.println(result);
    }
}
