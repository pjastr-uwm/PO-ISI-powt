package rekordy.zad1;

public class TestBookDTO {

    public static void main(String[] args) {
        BookDTO b1 = new BookDTO("Pan Tadeusz","Adam Mickiewicz",
                45.67, 2010);
        System.out.println(b1);
        BookDTO b2 = new BookDTO(new String("Pan Tadeusz"),"Adam Mickiewicz",
                45.67, 2010);
        System.out.println(b1.equals(b2));
        System.out.println(b1 == b2);
        System.out.println(b1.hashCode() == b2.hashCode());
        System.out.println(b1.title());
        //b1.title() = "rfgfg";
    }
}
