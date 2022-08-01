package login;

import base.BaseTests;
import org.junit.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.junit.Assert.*;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin(){
        LoginPage login = homePage.clickFormAuthentication();
        login.setUsername("tomsmith");
        login.setPassword("SuperSecretPassword!");
        SecureAreaPage secureArea = login.clickLoginButton();
        assertTrue(secureArea.getAlertText().contains("You logged into a secure area!"));
    }

}
