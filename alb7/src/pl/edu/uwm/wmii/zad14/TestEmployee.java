package pl.edu.uwm.wmii.zad14;

public class TestEmployee {

    public static void main(String[] args) {
        Employee e1 = new Employee("Jan", "Nowak", 5000.23);
        Employee e2 = new Employee("Jan", "Nowak", 5000.23);
        Employee e3 = null;
        Employee e4 = new Employee(null, "Nowak", 5000.23);
        Employee e5 = new Employee(new String("Jan"), "Nowak", 5000.23);
        System.out.println(e1.equals(e1));
        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(e3));
        System.out.println(e1.equals(e4));
        System.out.println(e1.equals(e5));
        System.out.println(e1.hashCode() == e5.hashCode());
        Programmer p1 = new Programmer("Jan", "Nowak",
                5000.23, "Java");
        System.out.println(p1.equals(e1));
        System.out.println(e1.equals(p1));
    }
}
