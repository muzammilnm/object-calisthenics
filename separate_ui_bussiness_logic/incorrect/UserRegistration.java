package separate_ui_bussiness_logic.incorrect;

public class UserRegistration {
    public void registerUser(String username, String password) {
        // UI Logic: Validation
        if (username.isEmpty() || password.length() < 6) {
            System.out.println("Invalid username or password.");
            return;
        }

        // Business Logic: Registration
        System.out.println("User " + username + " registered successfully.");
    }
}
