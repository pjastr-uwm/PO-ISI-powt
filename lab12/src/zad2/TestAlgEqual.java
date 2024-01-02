package zad2;

public class TestAlgEqual {

    public static void main(String[] args) {
        AlgEqual a1 = new AlgEqual();
        System.out.println(a1.isEquals(4, 4));
        System.out.println(a1.isEquals(4, -3));
        System.out.println(a1.isEquals("Hello", "Hello"));
    }
}
