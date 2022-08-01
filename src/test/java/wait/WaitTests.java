package wait;

import base.BaseTests;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homePage.clickDynamicLoading();
        var example1Page = loadingPage.clickExample1();

        example1Page.clickStartButton();
        String text = example1Page.getLoadedText();

        assertEquals(text, "Hello World!");
    }

}
