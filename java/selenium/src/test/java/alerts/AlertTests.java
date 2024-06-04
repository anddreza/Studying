package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
     var alertsPage = homePage.clickJavaScriptAlert();
     alertsPage.triggerAlert();
     alertsPage.alert_clickToAccept();
     assertEquals(alertsPage.getResult(), "You successfully clicked an alert", "Result text incorrect");

    }

    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickJavaScriptAlert();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text,"I am a JS Confirm", "Alert text incorrect");

    }

    @Test
    public void testSetInputAlert(){
        var alertsPage = homePage.clickJavaScriptAlert();
        alertsPage.triggerPrompt();

        String text = "TAU rocks!";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You entered: " + text, "Result not incorrect");

    }
}
