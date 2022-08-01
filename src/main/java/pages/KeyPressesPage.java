package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
    private By inputField = By.id("target");
    private By resultText = By.id("result");

    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setInputField(String input){
        driver.findElement(inputField).sendKeys(input);
    }

    public void enterPi(){
        setInputField(Keys.chord(Keys.ALT,"p") + "=3.14");
    }

    public String getResult(){
        return driver.findElement(resultText).getText();
    }


}
