package first_class_collections.correct;

import java.util.List;

public class Order {
    private Items items;

    public Order() {
        this.items = new Items();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public List<String> getItems() {
        return items.getAll();
    }
}
