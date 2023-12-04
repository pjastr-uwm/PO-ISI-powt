package zlozone.zad2;

import java.util.Objects;

public class FantasyBook extends Book{

    private String fantasySubgenre;

    public FantasyBook(String title, String author, double[] reviews, String fantasySubgenre) {
        super(title, author, reviews);
        this.fantasySubgenre = fantasySubgenre;
    }

    public String getFantasySubgenre() {
        return fantasySubgenre;
    }

    public void setFantasySubgenre(String fantasySubgenre) {
        this.fantasySubgenre = fantasySubgenre;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", fantasySubgenre='" + fantasySubgenre ;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        FantasyBook that = (FantasyBook) o;

        return Objects.equals(fantasySubgenre, that.fantasySubgenre);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (fantasySubgenre != null ? fantasySubgenre.hashCode() : 0);
        return result;
    }
}
