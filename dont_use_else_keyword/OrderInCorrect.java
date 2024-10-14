package dont_use_else_keyword;

public class OrderInCorrect {
    public void processOrder(boolean hasStock, boolean isPaid) {
        if (hasStock && isPaid) {
            System.out.println("Order processed.");
        } else {
            System.out.println("Order cannot be processed.");
        }
    }
}
