package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    WebDriver driver;
    private By emailField = By.id("email");
    private By retrieveButton = By.cssSelector("#forgot_password button");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmailField(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public EmailSentPage clickRetrieveButton() {
        driver.findElement(retrieveButton).click();
        return new EmailSentPage(driver);
    }

    public EmailSentPage retrievePassword(String email){
        setEmailField(email);
        return clickRetrieveButton();
    }
}