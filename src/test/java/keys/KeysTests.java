package keys;

import base.BaseTests;
import org.junit.Test;
import org.openqa.selenium.Keys;

import static org.junit.Assert.*;

public class KeysTests extends BaseTests {

    @Test
    public void testBackspace(){
        var keyPage = homePage.clickKeyPresses();
        keyPage.setInputField("T" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(), "You entered: BACK_SPACE");
    }

    @Test
    public void testPI(){
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterPi();
    }

    @Test
    public void testHorizontalSlider(){
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.moveSlider(4);
        assertEquals(horizontalSliderPage.getNumberValue(), "4");
    }

}
