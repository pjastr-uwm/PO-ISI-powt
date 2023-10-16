import java.util.Random;

public class Losowosc {

    public static void main(String[] args) {
        Random random = new Random();
        random.setSeed(1);
        int a = random.nextInt(101);
        System.out.println(a);
    }
}
