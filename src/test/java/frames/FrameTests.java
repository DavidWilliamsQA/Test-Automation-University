package frames;

import base.BaseTests;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiwyg(){
        var wysiwygPage = homePage.clickWysiwygEditor();
        wysiwygPage.clearTextArea();

        String text1 = "Hey";
        String text2 = "Angie!";

        wysiwygPage.setTextArea(text1);

        wysiwygPage.decreaseIndent();

        wysiwygPage.setTextArea(text2);

        String text = wysiwygPage.getTextFromTextArea();

        assertEquals(text, text1 + text2);
    }

}
