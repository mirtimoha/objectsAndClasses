public class Main {
    public static void main(String[] args) {
        Author dostoevskiy = new Author("Фёдор" , "Достоевский");
        Author london = new Author("Джек", "Лондон");
        Book crimeAndPunishment = new Book("Преступление и наказание", dostoevskiy, 2005);
        Book whiteFang = new Book("Белый Клык", london, 2001);
        whiteFang.setReleaseYear(2023);
    }
}

