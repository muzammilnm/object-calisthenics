package one_level_ndentation_per_method;

public class Order {
    private boolean valid;
    private boolean hasStock;
    private boolean enoughBalance;

    public Order(boolean valid, boolean hasStock, boolean enoughBalance) {
        this.valid = valid;
        this.hasStock = hasStock;
        this.enoughBalance = enoughBalance;
    }

    public boolean isValid() {
        return valid;
    }

    public boolean hasStock() {
        return hasStock;
    }

    public boolean hasEnoughBalance() {
        return enoughBalance;
    }

    public void ship() {
        System.out.println("Order has been shipped!");
    }
}

