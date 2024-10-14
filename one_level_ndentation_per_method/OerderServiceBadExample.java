package one_level_ndentation_per_method;

public class OerderServiceBadExample {
    public void processOrder(Order order) {
        if (order.isValid()) {
            if (order.hasStock()) {
                if (order.hasEnoughBalance()) {
                    order.ship();
                } else {
                    System.out.println("Insufficient balance.");
                }
            } else {
                System.out.println("Stock unavailable.");
            }
        } else {
            System.out.println("Invalid order.");
        }
    }
}
