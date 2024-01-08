package kolekcje.zadF1;

import java.util.TreeSet;

public class Alg {

    public <T extends Comparable<T>> TreeSet<T> findElementsInRange(TreeSet<T> set, T lowerBournd, T upperBound){
        TreeSet<T> temp = new TreeSet<>();
        for(var elem: set){
            if (lowerBournd.compareTo(elem) <=0 && elem.compareTo(upperBound)<=0){
                temp.add(elem);
            }
        }
        return  temp;
    }
}
