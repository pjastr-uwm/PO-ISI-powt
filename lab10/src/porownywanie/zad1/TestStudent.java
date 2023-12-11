package porownywanie.zad1;

import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Jan", 4.6, 2001));
        list.add(new Student("Sylwia", 4.2, 2011));
        list.add(new Student("Anna", 4.1, 1999));
        list.add(new Student("Krzysztof", 4.6, 1995));
        list.add(new Student("Jan", 4.5, 2005));
        for(var elem: list){
            System.out.println(elem);
        }

        Collections.sort(list);
        System.out.println("After sort");
        for(var elem: list){
            System.out.println(elem);
        }
    }
}
