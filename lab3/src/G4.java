import java.util.ArrayList;

public class G4 {

    public static void main(String[] args) {
        ArrayList<Integer> lt1 = new ArrayList<>();
        lt1.add(-4);
        lt1.add(11);
        lt1.add(-65);
        System.out.println(lt1);
        System.out.println(minimumValue(lt1));
        //ArrayList<Integer> lt2 = new ArrayList<>();
        //System.out.println(lt2);
        //System.out.println(minimumValue(lt2));
        //ArrayList<Integer> lt3 = null;
        //System.out.println(lt3);
        //System.out.println(minimumValue(lt3));
    }

    public static int minimumValue(ArrayList<Integer> arg)
    {
        /*if (arg==null || arg.isEmpty())
        {
            throw new IllegalArgumentException("Lista tablicowa jest pusta lub null");
        }*/
        int temp = arg.get(0);
        for(int elem: arg)
        {
            if (elem < temp)
            {
                temp = elem;
            }
        }
        return temp;
    }
}
