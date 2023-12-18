package porownywanie.zad21;

import java.util.ArrayList;

public class TestClient {

    public static void main(String[] args) {
        ArrayList<Client> list = new ArrayList<>();
        list.add(new Client("AA", 4.3));
        list.add(new Client("BB", 4.3));
        list.add(new Company("AA", 4.3, 345));
        list.add(new Company("CC", 3.1, 123));
        list.add(new Client("DD", 2.9));
        list.add(new Company("CC", 3.1, 345));
        for (var elem: list){
            System.out.println(elem);
        }
        System.out.println(list.get(0).compareTo(list.get(2)));
        System.out.println(list.get(2).compareTo(list.get(0)));
        list.sort(null);
        System.out.println("After sort");
        for (var elem: list){
            System.out.println(elem);
        }


    }
}
