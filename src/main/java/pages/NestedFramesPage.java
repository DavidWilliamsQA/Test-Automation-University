package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    private WebDriver driver;
    private String frameSetTopName ="frame-top";
    private String leftFrameName = "frame-left";
    private String bottomFrameName = "frame-bottom";
    private By body = By.tagName("body");

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTextFromLeftFrame(){
        switchToFrame(frameSetTopName);
        switchToFrame(leftFrameName);

        String text = driver.findElement(body).getText();

        switchOutOfFrame();
        switchOutOfFrame();

        return text;
    }

    public String getTextFromBottomFrame(){
        switchToFrame(bottomFrameName);
        String text = driver.findElement(body).getText();
        switchOutOfFrame();

        return text;
    }

    private void switchToFrame(String frame){
        driver.switchTo().frame(frame);
    }

    private void switchOutOfFrame(){
        driver.switchTo().parentFrame();
    }

}
