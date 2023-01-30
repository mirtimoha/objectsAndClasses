public class Main {
    public static void main(String[] args) {
        Author dostoevskiy = new Author("Фёдор" , "Достоевский");
        Author london = new Author("Джек", "Лондон");
        Book crimeAndPunishment = new Book("Преступление и наказание", dostoevskiy, 2005);
        Book whiteFang = new Book("Белый Клык", london, 2001);
        whiteFang.setReleaseYear(2023);
    }
}
class Book {
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
}
class Author {
    private final String firstName;
    private final String lastName;

    Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName () {
        return lastName;
    }
}