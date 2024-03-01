import java.time.LocalDate;

public class Electronics extends Product{
    private String brand;
    private String color;
    private boolean isNew;
    private int memory;

    public Electronics() {
    }

    public Electronics(String brand, String color, boolean isNew, int memory) {
        this.brand = brand;
        this.color = color;
        this.isNew = isNew;
        this.memory = memory;
    }

    public Electronics(String name, String description, int price, LocalDate createAt, String brand, String color, boolean isNew, int memory) {
        super(name, description, price, createAt);
        this.brand = brand;
        this.color = color;
        this.isNew = isNew;
        this.memory = memory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isIxNew() {
        return isNew;
    }

    public void setIxNew(boolean ixNew) {
        this.isNew = ixNew;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", ixNew=" + isNew +
                ", memory='" + memory + '\'' +
                "} " + super.toString();
    }
}
