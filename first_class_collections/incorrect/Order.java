package first_class_collections.incorrect;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<String> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public List<String> getItems() {
        return items;
    }
}
