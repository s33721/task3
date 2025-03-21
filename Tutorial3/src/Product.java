public class Product {
    private int id;
    private String name;
    private String category;
    private double price;
    private int stockQuantity;

    private void setId(int id) {
        this.id = id;
    }

    private int getId() {
        return id;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }

    private void setCategory(String category) {
        this.category = category;
    }

    private String getCategory() {
        return category;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    private double getPrice() {
        return price;
    }

    private void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    private int getStockQuantity() {
        return stockQuantity;
    }
    public void displayInfo(){
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Category: " + getCategory());
        System.out.println("Price: " + getPrice());
        System.out.println("Stock Quantity: " + getStockQuantity());
    }

}
