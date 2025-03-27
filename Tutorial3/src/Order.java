import
public class Order {
    private int id;
    private Customer customer;
    private Product[] products;
    private int[] quantities;
    private String orderDate;
    private String status;


    private void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setProducts(Product[] products) {
        this.products = products;
    }
    public Product[] getProducts() {
        return products;
    }
    public void setQuantities(int[] quantities) {
        this.quantities = quantities;
    }
    public int[] getQuantities() {
        return quantities;
    }
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
    public String getOrderDate() {
        return orderDate;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
    public double calculateTotalValue(Product[] products, int[] quantities) {
        double total = 0;
        for (int i = 0; i < products.length; i++) {
            total += products[i].getPrice() * quantities[i];
        }
        return total;
    }
    public double applyDiscount(Product product, boolean ) {}

}

