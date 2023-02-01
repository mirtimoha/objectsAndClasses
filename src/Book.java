import java.util.Objects;

public class Book {
    private final String title;
    private final Author author;
    private int releaseYear;

    Book(String title, Author author, int releaseYear) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    @Override
    public String toString() {
        return title + ", автор " + author + ", год издания " + releaseYear;
    }
    @Override
    public boolean equals (Object otherBook) {
        if (otherBook == this) return true;
        if (!(otherBook instanceof Book)) {
            return false;
        }
        Book book = (Book) otherBook;
        return this.getTitle().equals(book.getTitle()) &&
                this.getAuthor().equals(book.getAuthor()) &&
                this.getReleaseYear() == book.getReleaseYear();
    }
    @Override
    public int hashCode() {
        return Objects.hash(title, author, releaseYear);
    }
}
