package Asserts_demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class loginTest {

    @Test
    @Parameters({"username", "password"})
    public void login(String user, String pass) {
        System.out.println("===== Dummy Login Test =====");
        System.out.println("Username: " + user);
        System.out.println("Password: " + pass);

        // Dummy validation
        if(user.equals("admin") && pass.equals("admin123")) {
            System.out.println("Login Successful ✅");
        } else {
            System.out.println("Login Failed ❌");
        }
    }
}
