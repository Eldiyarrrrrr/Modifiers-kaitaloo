import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Product {
    private String name;
    private String description;
    private int price;
    private LocalDate createAt;


    public Product() {
    }

    public Product(String name, String description, int price, LocalDate createAt) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.createAt = createAt;
    }


    public static Book[] booksMss = {};

    public static Electronics[] electronics1 = {};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDate createAt) {
        this.createAt = createAt;
    }

    public Product[] methodElectronic() {
        Scanner scanner = new Scanner(System.in);
        Electronics electronics = new Electronics();
        System.out.println("Producttun name in jazynyz: ");
        electronics.setName(scanner.nextLine());
        System.out.println("description syn jazynyz: ");
        electronics.setDescription(scanner.nextLine());
        System.out.println("price yn jazynyz: ");
        electronics.setPrice(scanner.nextInt());
        electronics.setCreateAt(LocalDate.now());
        System.out.println("Brandtin jazynyz: ");
        electronics.setBrand(scanner.nextLine());
        electronics.setBrand(scanner.nextLine());
        System.out.println("colorun jazynyz: ");
        electronics.setColor(scanner.nextLine());
        System.out.println("janyby?  eskibi? ");
        electronics.setIxNew(scanner.nextBoolean());
        System.out.println("память jazynyz: ");
        electronics.setMemory(scanner.nextInt());
        electronics1 = Arrays.copyOf(electronics1, electronics1.length + 1);
        electronics1[electronics1.length - 1] = electronics;
        return electronics1;
    }

    public Product[] methodBook() {
        Scanner scanner1 = new Scanner(System.in);
        Book book = new Book();
        System.out.println("authorFullName in jazynyz: ");
        book.setAuthorFullName(scanner1.nextLine());
        System.out.println("Producttun name yn jazynyz: ");
        String name = new Scanner(System.in).nextLine();
        book.setName(name);
        System.out.println("description yn jazynyz: ");
        book.setDescription(scanner1.nextLine());
        System.out.println("price yn jazynyz: ");
        book.setPrice(scanner1.nextInt());
        System.out.println("Enter dateOfBirth:");
        book.setCreateAt(LocalDate.of(scanner1.nextInt(),scanner1.nextInt(),scanner1.nextInt()));
        booksMss = Arrays.copyOf(booksMss,booksMss.length + 1);
        booksMss[booksMss.length - 1] = book;
        return booksMss;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", createAt=" + createAt +
                '}';
    }
}
