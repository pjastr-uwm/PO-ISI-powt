package kompator.zad14;

import java.util.Arrays;

public class TestSong {

    public static void main(String[] args) {
        Song[] tab = new Song[5];
        tab[0] = new Song("AA", "XX", 45);
        tab[1] = new Song("gg", "yy", 54);
        tab[2] = new Song("kk", "aa", 45);
        tab[3] = new Song("tt", "bb", 45);
        tab[4] = new Song("33", "AA", 45);
        for (var elem: tab){
            System.out.println(elem);
        }
        Arrays.sort(tab, new DurationComparator().thenComparing(new ArtistTitleComparator()));
        System.out.println("After sorting");
        for (var elem: tab){
            System.out.println(elem);
        }
    }
}
