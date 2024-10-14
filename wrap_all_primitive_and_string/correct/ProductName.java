package wrap_all_primitive_and_string.correct;

public class ProductName {
    private final String name;

    public ProductName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be empty.");
        }
        this.name = name;
    }

    public String getValue() {
        return name;
    }
}

