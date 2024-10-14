package one_dot_per_line.incorrect;

import one_dot_per_line.Order;

public class OrderProcessor {
    public void process(Order order) {
        String city = order.getCustomer().getAddress().getCity().toUpperCase();
    }
}
