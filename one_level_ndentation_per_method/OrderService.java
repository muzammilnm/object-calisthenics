package one_level_ndentation_per_method;

public class OrderService {
    public void processOrder(Order order) {
        if (!order.isValid()) {
            System.out.println("Invalid order.");
            return;
        }

        if (!order.hasStock()) {
            System.out.println("Stock unavailable.");
            return;
        }

        if (!order.hasEnoughBalance()) {
            System.out.println("Insufficient balance.");
            return;
        }

        order.ship();
    }
}
