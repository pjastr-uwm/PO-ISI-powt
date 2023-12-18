package kopiowanie.zad2;

public class TestTeacher {

    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher t1 = new Teacher("AA", "XX", 45);
        Teacher t2 = t1.clone();
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t1 == t2);
    }
}
