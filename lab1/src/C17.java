import java.util.Scanner;

public class C17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę n");
        int n = input.nextInt();
        int i=1;
        int licznik=0;
        int potega =1;
        int silnia =1;
        while(i<=n)
        {
            potega *=3;
            silnia *=i;
            System.out.println("Podaj liczbę numer "+i);
            int temp = input.nextInt();
            if (potega< temp && temp < silnia)
            {
                licznik++;
            }
            i++;
        }
        System.out.println("Licznik:"+licznik);
    }
}
