package kolekcje.zadD2;

import java.util.LinkedList;

public class Alg {

    public <T> LinkedList<T> findCommonElements(LinkedList<T> list1, LinkedList<T> list2){
        LinkedList<T> temp = new LinkedList<>();
        for(var element: list1){
            if (list2.contains(element) && !temp.contains(element)){
                temp.add(element);
            }
        }
        return temp;
    }
}
