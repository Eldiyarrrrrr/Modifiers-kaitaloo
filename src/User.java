import java.util.Arrays;
import java.util.Scanner;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String[] products = new String[0];


    public User() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = new String[]{products};
    }
    public void methodUser() {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            String scanEmail = scanner.nextLine();
            String scanPassword = scanner.nextLine();
        }
    }




    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}
