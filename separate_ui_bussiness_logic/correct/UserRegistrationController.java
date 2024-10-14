package separate_ui_bussiness_logic.correct;

public class UserRegistrationController {
    private UserRegistration userRegistration;

    public UserRegistrationController(UserRegistration userRegistration) {
        this.userRegistration = userRegistration;
    }

    public void handleRegistration(String username, String password) {
        // UI Logic: Validation
        if (username.isEmpty() || password.length() < 6) {
            System.out.println("Invalid username or password.");
            return;
        }

        User user = new User(username, password);
        userRegistration.registerUser(user);
    }
}
