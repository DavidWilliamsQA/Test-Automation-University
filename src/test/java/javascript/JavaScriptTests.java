package javascript;

import base.BaseTests;
import org.junit.Test;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable(){
        var scrollTo = homePage.clickLargeAndDeepDom();
        scrollTo.scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph() {
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }

}
