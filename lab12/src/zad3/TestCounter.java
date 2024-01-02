package zad3;

public class TestCounter {

    public static void main(String[] args) {
        Counter<String> c1 = new Counter<>();
        c1.add("Aaa");
        c1.add("Bbb");
        System.out.println(c1.getCount());
        System.out.println(c1);
    }
}
