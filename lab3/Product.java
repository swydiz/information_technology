package lab3;

public class Product {
    private String title;
    private String description;
    private double price;
    private int quantity;

    public Product(String title, String description, double price, int quantity) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        }
    }

    @Override
    public String toString() {
        return "название: '" + title + '\'' +
               ", описание: '" + description + '\'' +
               ", цена: " + price +
               ", количество: " + quantity;
    }
}
