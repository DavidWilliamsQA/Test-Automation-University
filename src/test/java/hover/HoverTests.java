package hover;

import base.BaseTests;
import org.junit.Test;

import static org.junit.Assert.*;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverUser1(){
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);

        assertTrue(caption.isCaptionDisplayed());
        assertEquals(caption.getTitle(), "name: user1");
        assertEquals(caption.getLinkText(), "View profile");
        assertTrue(caption.getLink().endsWith("/users/1"));
    }

    @Test
    public void testHoverUser2(){
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(2);

        assertTrue(caption.isCaptionDisplayed());
        assertEquals(caption.getTitle(), "name: user2");
        assertEquals(caption.getLinkText(), "View profile");
        assertTrue(caption.getLink().endsWith("/users/2"));
    }

    @Test
    public void testHoverUser3(){
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(3);

        assertTrue(caption.isCaptionDisplayed());
        assertEquals(caption.getTitle(), "name: user3");
        assertEquals(caption.getLinkText(), "View profile");
        assertTrue(caption.getLink().endsWith("/users/3"));
    }

}
