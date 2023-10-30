public class TestPerson {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "John";
        Person p2 = p1;
        p2.name = "Anna";
        System.out.println("p1 "+p1.name);
        System.out.println("p2 "+p2.name);

    }
}

class Person{
    String name;
}
