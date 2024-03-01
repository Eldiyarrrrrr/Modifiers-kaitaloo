import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Product product = new Product();

        String dayarEmail = "eldiyar@gmail.com";
        String dayarPassword = "eldiyar.00";

        while (true) {
            System.out.println("""
                    1. Register
                    2. Login
                    3. Exit
                    """);

            switch (scanner.nextLine()) {
                case "1", "Register" -> {
                    User user = new User();
                    System.out.println("firstName jazynyz: ");
                    user.setFirstName(scanner.nextLine());
                    System.out.println("lastName jazynyz: ");
                    user.setLastName(scanner.nextLine());
                    System.out.println("email jazynyz: ");
                    user.setEmail(scanner.nextLine());
                    System.out.println("password jazynyz: ");
                    user.setPassword(scanner.nextLine());
                    User[] users = {user};
                    for (User user2 : users) {
                        System.out.println(user2);
                    }

                }
                case "2", "Login" -> {
                    if (scanner.nextLine().equalsIgnoreCase(dayarEmail) && scanner.nextLine().equalsIgnoreCase(dayarPassword)) {
                        System.out.println("dannyilar tuura!!");
                    }else {
                        System.out.println("Dannyilar tuura emes!!!");
                        return;
                    }
                }
                case "3", "Exit" -> {
                    return;
                }
                default -> {
                    System.out.println("komanda tuura emes terildi!!!");
                    return;
                }
            }

            while (true) {
                System.out.println("""
                        1. -Add new Product
                        2. -Get All Products
                        3. -Get All Books
                        4. -Get All Electronics
                                                """);
                switch (scanner.nextInt()) {
                    case 1 -> {
                        System.out.println("""
                                11.Elektronic koshuu
                                22.Book koshuu
                                """);

                        switch (scanner.nextInt()) {
                            case 11 -> {
                                System.out.println(Arrays.toString(product.methodElectronic()));

                            }

                            case 22 -> {
                                System.out.println(Arrays.toString(product.methodBook()));

                            }
                        }
                    }

                        case 2 -> {
                            System.out.println(Arrays.toString(Product.electronics1));
                            System.out.println(Arrays.toString(Product.booksMss));
                        }
                        case 3 -> {
                            System.out.println(Arrays.toString(Product.booksMss));
                        }
                        case 4 -> {
                            System.out.println(Arrays.toString(Product.electronics1));
                    }

                }
            }
        }
    }
}
