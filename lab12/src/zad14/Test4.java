package zad14;

import java.util.Comparator;

public class Test4 {

    public static void main(String[] args) {

        Integer[] tab = {3,-4,6};
        System.out.println(minValue(tab));
        Person[] people = new Person[5];
        people[0] = new Person("Jan", 23);
        people[1] = new Person("Anna", 12);
        people[2] = new Person("Jan", 38);
        people[3] = new Person("Ewa", 23);
        people[4] = new Person("Anna", 44);
        System.out.println(minValue(people));
    }

    public static <T extends Comparable<T>> T minValue(T[] array){
        if (array == null || array.length == 0){
            throw new IllegalArgumentException("tablica jest nullem lub jest pusta");
        }
        T temp = array[0];
        for(T elem: array){
            if (elem.compareTo(temp) < 0 ){
                temp = elem;
            }
        }
        return temp;
    }
}
