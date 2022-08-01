package frames;

import base.BaseTests;
import org.junit.Test;

import static org.junit.Assert.*;

public class NestedFramesTests extends BaseTests {

    @Test
    public void nestedFramesTest(){
        var framesPage = homePage.clickFrame();
        var nestedFramesPage = framesPage.clickNestedFrame();

        String leftText = nestedFramesPage.getTextFromLeftFrame();
        String bottomText = nestedFramesPage.getTextFromBottomFrame();

        assertEquals(leftText, "LEFT");
        assertEquals(bottomText, "BOTTOM");
    }


}
