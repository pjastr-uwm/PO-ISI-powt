package generyki.zad23;

public class Test23 {

    public static void main(String[] args) {
        Pair<Animal> p1 = new Pair<>(new Animal("AA"), new Animal("jj"));
        System.out.println(findMax(p1));

        Pair<Dog> p2 = new Pair<>(new Dog("hh"), new Dog("uu"));
        System.out.println(findMax(p2));
    }

    public static Animal findMax(Pair<? extends Animal> arg){
        if (arg == null){
            throw new IllegalArgumentException();
        }
        return arg.getFirst();
    }
}
