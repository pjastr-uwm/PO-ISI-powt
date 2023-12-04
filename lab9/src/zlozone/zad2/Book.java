package zlozone.zad2;

import java.util.Arrays;
import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private double[] reviews;

    public Book(String title, String author, double[] reviews) {
        this.title = title;
        this.author = author;
        this.reviews = reviews==null ? new double[0] : reviews.clone();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double[] getReviews() {
        return reviews.clone();
    }

    public void setReviews(double[] reviews) {
        if (reviews !=null)
            this.reviews = reviews.clone();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                ": title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", reviews=" + Arrays.toString(reviews);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (!Objects.equals(title, book.title)) return false;
        if (!Objects.equals(author, book.author)) return false;
        return Arrays.equals(reviews, book.reviews);
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(reviews);
        return result;
    }

    public void addReview(double newValue)
    {
        double[] temp = new double[reviews.length+1];
        for(int i=0;i<reviews.length;i++){
            temp[i] = reviews[i];
        }
        temp[reviews.length] = newValue;
        reviews = temp;
    }
}
