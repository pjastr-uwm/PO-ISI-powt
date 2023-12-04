package zlozone.zad2;

public class TestBook {

    public static void main(String[] args) {
        double[] tablica = {4.6, 7.3, -7.8, 9.2};
        Book b1 = new Book("sdd","ytut", tablica);
        Book b2 = new Book("sdd","ytut", new double[]{4.6, 7.3, -7.8, 9.2});
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1.equals(b2));
    }
}
