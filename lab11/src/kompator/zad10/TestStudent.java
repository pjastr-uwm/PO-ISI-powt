package kompator.zad10;

import java.util.ArrayList;

public class TestStudent {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(234, "EE", 3.6));
        list.add(new Student(678, "BB", 3.8));
        list.add(new Student(345, "AA", 4.2));
        list.add(new Student(111, "CC", 2.9));
        list.add(new Student(888, "DD", 3.6));
        for (var elem: list){
            System.out.println(elem);
        }
        list.sort(new MyComparator());
        System.out.println("After sorting");
        for (var elem: list){
            System.out.println(elem);
        }
    }
}
