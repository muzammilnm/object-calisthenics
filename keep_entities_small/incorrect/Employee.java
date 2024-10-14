package keep_entities_small.incorrect;

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

    public void generatePaySlip() {
        // Logic for generating a payslip
    }

    public void calculateTaxes() {
        // Logic for calculating taxes
    }
}
