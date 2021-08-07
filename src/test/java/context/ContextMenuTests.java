package context;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void contextMenuAlertVerifyText(){
        var contextMenuPage = homePage.clickContextMenuPage();
        contextMenuPage.activateContextAlert();

        // This is my solution which also works.
//        assertEquals(contextMenuPage.alert_getText(),"You selected a context menu", "Alert text is incorrect");
//        contextMenuPage.alert_clickToAccept();
//        contextMenuPage.closeContextMenu();

        // Angie's solution mixed with mine:
        String message = contextMenuPage.alert_getText();
        contextMenuPage.alert_clickToAccept();
        contextMenuPage.closeContextMenu();
        assertEquals(message,"You selected a context menu", "Alert text is incorrect");
    }
}
