public class C3 {

    public static void main(String[] args) {
        int pop=0;
        int biez=1;
        for(int i=1;i<=10;i++)
        {
            System.out.println(biez);
            biez = pop +(pop=biez);
        }
    }
}
