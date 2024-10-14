package wrap_all_primitive_and_string.correct;

public class Quantity {
    private final int value;

    public Quantity(int value) {
        if (value < 1) {
            throw new IllegalArgumentException("Quantity must be greater than zero.");
        }
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
