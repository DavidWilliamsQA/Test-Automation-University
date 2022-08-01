package alerts;

import base.BaseTests;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContextClickTests extends BaseTests {

    @Test
    public void testContextClick(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.contextClickHotspot();
        String text  = contextMenuPage.alert_getText();
        contextMenuPage.alert_clickAccept();

        assertEquals(text, "You selected a context menu");
    }

}
