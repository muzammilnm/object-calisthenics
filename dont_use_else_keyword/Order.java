package dont_use_else_keyword;

public class Order {
    public void processOrder(boolean hasStock, boolean isPaid) {
        if (!hasStock) {
            System.out.println("Order cannot be processed: out of stock.");
            return;
        }

        if (!isPaid) {
            System.out.println("Order cannot be processed: payment pending.");
            return;
        }

        System.out.println("Order processed.");
    }
}
