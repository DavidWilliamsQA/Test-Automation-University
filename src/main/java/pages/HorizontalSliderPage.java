package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By slider = By.cssSelector(".sliderContainer input");
    private By numberText = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getNumberValue(){
        return driver.findElement(numberText).getText();
    }

    public void moveSlider(Integer count){
        while(!getNumberValue().equals(count.toString())){
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }
}
