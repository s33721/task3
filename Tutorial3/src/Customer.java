public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private boolean isLoyalCustomer;

    private void setId(int id) {
        this.id = id;
    }

    private int getId() {
        return id;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String getFirstName() {
        return firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String getLastName() {
        return lastName;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private String getEmail() {
        return email;
    }

    private void setIsLoyalCustomer(boolean isLoyalCustomer) {
        this.isLoyalCustomer = isLoyalCustomer;
    }

    private boolean isLoyalCustomer() {
        return isLoyalCustomer;
    }

    public void displayInfo() {
        System.out.println("ID: " + getId());
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Email: " + getEmail());
        System.out.println("IsLoyalCustomer: " + isLoyalCustomer());
    }
}
