import java.time.LocalDate;

public class Book extends Product{
    private String authorFullName;

    public Book() {
    }


    public Book(String authorFullName) {
        this.authorFullName = authorFullName;
    }

    public Book(String name, String description, int price, LocalDate createAt, String authorFullName) {
        super(name, description, price, createAt);
        this.authorFullName = authorFullName;
    }

    public String getAuthorFullName() {
        return authorFullName;
    }

    public void setAuthorFullName(String authorFullName) {
        this.authorFullName = authorFullName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorFullName='" + authorFullName + '\'' +
                "} " + super.toString();
    }
}
