package first_class_collections.correct;

import java.util.ArrayList;
import java.util.List;

class Items {
    private List<String> items;

    public Items() {
        this.items = new ArrayList<>();
    }

    public void add(String item) {
        items.add(item);
    }

    public List<String> getAll() {
        return new ArrayList<>(items); // Return a copy to prevent external modification
    }

    public int size() {
        return items.size();
    }
}
