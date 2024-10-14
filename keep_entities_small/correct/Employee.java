package keep_entities_small.correct;

public class Employee {
    private String name;
    private String address;
    private String department;

    public void updateAddress(String newAddress) {
        this.address = newAddress;
    }

    public void promote(String newDepartment) {
        this.department = newDepartment;
    }
}
