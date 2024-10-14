package wrap_all_primitive_and_string.incorrect;

public class Order {
    private int quantity;
    private double pricePerUnit;
    private String productName;

    public Order(int quantity, double pricePerUnit, String productName) {
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.productName = productName;
    }

    public double calculateTotal() {
        return quantity * pricePerUnit;
    }
}
