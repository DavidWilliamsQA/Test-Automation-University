package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By hotSpot = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void contextClickHotspot(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(hotSpot)).contextClick().perform();
    }

    public String alert_getText() {
        return driver.switchTo().alert().getText();
    }

    public void alert_clickAccept(){
        driver.switchTo().alert().accept();
    }

}
