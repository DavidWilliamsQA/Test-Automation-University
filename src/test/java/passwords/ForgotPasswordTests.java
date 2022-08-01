package passwords;

import base.BaseTests;
import org.junit.Test;

import static org.junit.Assert.*;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testRetrievePassword(){
        var forgetPasswordPage = homePage.clickForgotPassword();
        var emailSentPage = forgetPasswordPage.retrievePassword("tau@example.com");
        assertEquals(emailSentPage.getMessage(), "Your e-mail's been sent!");
    }
}