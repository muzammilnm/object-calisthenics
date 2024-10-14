package wrap_all_primitive_and_string.correct;

public class Order {
    private final Quantity quantity;
    private final Price pricePerUnit;
    private final ProductName productName;

    public Order(Quantity quantity, Price pricePerUnit, ProductName productName) {
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.productName = productName;
    }

    public double calculateTotal() {
        return quantity.getValue() * pricePerUnit.getValue();
    }
}
