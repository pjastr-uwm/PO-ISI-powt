package zad12;

import java.util.Arrays;

public class Test12 {

    public static void main(String[] args) {
        Integer[] t1 = {4,-5,11,23};
        swap(t1, 1,3);
        System.out.println(Arrays.toString(t1));
        String[] t2 = {"AA", "BB", "CC", "TT", "PP"};
        swap(t2, 4,2);
        System.out.println(Arrays.toString(t2));
    }

    public  static <T> void swap(T[] array, int ind1, int ind2){
        if (array == null){
            throw new IllegalArgumentException("Tablica jest nullem");
        }
        if (ind1 <0 || ind1 >= array.length || ind2<0 || ind2 >= array.length){
            throw new IllegalArgumentException("Nieprawidłowy index");
        }
        T temp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = temp;
    }
}
