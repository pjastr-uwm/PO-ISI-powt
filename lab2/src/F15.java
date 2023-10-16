import java.util.Arrays;

public class F15 {
    public static void main(String[] args) {
        int[] tab = {3,-4,5};
        System.out.println(Arrays.toString(tab));
        int[] tab2 = reverseArray(tab);
        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.toString(tab2));

    }

    public static int[] reverseArray(int[] tab)
    {
        int[] temp = new int[tab.length];
        for(int i=0;i<tab.length;i++)
        {
            temp[i] = tab[tab.length-1-i];
        }
        return temp;
    }
}
