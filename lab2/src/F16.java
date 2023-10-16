import java.util.Arrays;

public class F16 {

    public static void main(String[] args) {
        int[] tab = {3,-4,5};
        System.out.println(Arrays.toString(tab));
        reverseArray(tab);
        System.out.println(Arrays.toString(tab));
    }

    public static void reverseArray(int[] tab)
    {
        for(int i=0;i<tab.length/2;i++)
        {
            int temp = tab[i];
            tab[i] = tab[tab.length-1-i];
            tab[tab.length-1-i] = temp;
        }
    }
}
