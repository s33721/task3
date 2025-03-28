import java.util.ArrayList;

public class ComputerStore {
    private ArrayList<Product> products;
    private ArrayList<Customer> customers;
    private ArrayList<Order> orders;
    int productCount = 0;
    int customerCount = 0;
    int orderCount = 0;

    public void addProduct(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).equals(product)) {
                productCount++;
            } else {
                products.add(product);
            }
        }
    }

    private void addCustomer(Customer customer) {
        if (!customerExists(customer)) {
            customers.add(customer);
        } else {
            System.out.println("Customer already exists");
        }
    }

    private Order createOrder(Customer customer, Product[] products, int[] quantities) {
        if (!canPlaceOrder(products, quantities)) {
            return null;
        }

        Order newOrder = new Order();
        newOrder.setCustomer(customer);
        newOrder.setProducts(products);
        newOrder.setQuantities(quantities);

        return newOrder;
    }



    private boolean canPlaceOrder(Product[] products, int[] quantities) {
        if (products.length != quantities.length) {
            System.out.println("");
            return false;
        }

        for (int i = 0; i < products.length; i++) {
            var product = getProductById(products[i].getId());
            if (product == null) {
                System.out.println("Failed to create order. Product does not exist");
                return false;
            }

            if (product.getStockQuantity() < quantities[i]) {
                System.out.println("Failed to creat order. Stock quantity is too small");
                return false;
            }
        }

        return true;
    }

    private Product getProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }

        return null;
    }

    private boolean customerExists(Customer customer) {
        for (var existingCustomer : customers) {
            if (existingCustomer.getId() == customer.getId()) {
                return true;
            }
        }
        return false;
    }

    private boolean orderExists(Order order) {
        for (var existingOrder : orders) {
            if (existingOrder.getId() == order.getId()) {
                return true;
            }

        }
        return false;
    }



}
