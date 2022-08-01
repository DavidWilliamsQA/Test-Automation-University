package alerts;

import base.BaseTests;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlertsTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        String result  = alertsPage.getResult();

        assertEquals(result, "You successfully clicked an alert");
    }

    @Test
    public void testDismissAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();

        alertsPage.alert_clickToDismiss();
        String result = alertsPage.getResult();

        assertEquals(text, "I am a JS Confirm");
        assertEquals(result, "You clicked: Cancel");
    }

    @Test
    public void testInputPromptAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        String text = "Test Text";
        alertsPage.alert_inputTextToPrompt(text);

        alertsPage.alert_clickToAccept();
        String result = alertsPage.getResult();

        assertEquals(result,"You entered: " + text);



    }

}
