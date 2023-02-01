import java.util.Objects;

public class Author {
    private final String firstName;
    private final String lastName;

    Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
    @Override
    public boolean equals (Object otherAuthor) {
        if (otherAuthor == this) return true;
        if (!(otherAuthor instanceof Author)) {
            return false;
        }
        Author author = (Author) otherAuthor;
        return this.getFirstName().equals(author.getFirstName()) &&
                this.getLastName().equals(author.getLastName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
