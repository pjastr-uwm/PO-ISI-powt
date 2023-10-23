import java.util.Scanner;

public class H8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String napis = input.nextLine();
        String prefix = input.nextLine();
        String sufix = input.nextLine();
        if (napis.startsWith(prefix))
        {
            System.out.println("Prefix jest w napisie");
        }
        else
        {
            System.out.println("Prefixu nie ma w napisie");
        }
        if (napis.endsWith(sufix))
        {
            System.out.println("Sufix jest w napisie");
        }
        else
        {
            System.out.println("Sufixu nie ma w napisie");
        }
    }
}
