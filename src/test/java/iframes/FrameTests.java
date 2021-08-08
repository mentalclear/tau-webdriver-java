package iframes;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiwyg(){
        var wysiwygPage = homePage.clickWysiwygEditor();
        wysiwygPage.clearTextArea();
        String text1 = "Hello ";
        String text2 = "World!";
        wysiwygPage.setTextArea(text1);
        wysiwygPage.increaseIndent();
        wysiwygPage.setTextArea(text2);
        assertEquals(wysiwygPage.getTextFromEditor(), "Hello World!", "The text in the editor is incorrect!");
    }
}
