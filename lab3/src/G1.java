import java.util.ArrayList;

public class G1 {
    public static void main(String[] args) {
        ArrayList<Integer> lt = new ArrayList<>();
        lt.add(5);
        lt.add(-5);
        lt.add(7);
        lt.add(-9);
        lt.add(22);
        lt.add(-44);
        lt.add(-44);
        lt.add(7);
        lt.add(11);
        lt.add(-22);
        System.out.println(lt);
        for(int i=lt.size()-1;i>=0;i--)
        {
            System.out.println(lt.get(i));
        }
    }
}
