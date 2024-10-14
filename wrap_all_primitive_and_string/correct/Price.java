package wrap_all_primitive_and_string.correct;

public class Price {
    private final double value;

    public Price(double value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Price must be positive.");
        }
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
