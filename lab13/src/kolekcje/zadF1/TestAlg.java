package kolekcje.zadF1;

import java.util.TreeSet;

public class TestAlg {

    public static void main(String[] args) {
        Alg a1 = new Alg();
        TreeSet<String> tree = new TreeSet<>();
        tree.add("ttt");
        tree.add("ttt");
        tree.add("AA");
        tree.add("ww");
        tree.add("Ćma");
        System.out.println(tree);
        TreeSet<String> result = a1.findElementsInRange(tree, "UU", "www");
        System.out.println(result);
    }
}
