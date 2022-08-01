package wait;

import base.BaseTests;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaitExample2Tests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homePage.clickDynamicLoading();
        var example2Page = loadingPage.clickExample2();

        example2Page.clickStartButton();
        String text = example2Page.getLoadedText();

        assertEquals(text, "Hello World!");
    }

}
