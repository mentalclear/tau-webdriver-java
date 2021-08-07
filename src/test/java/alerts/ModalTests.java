package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ModalTests extends BaseTests {

    @Test
    public void testClosingModal(){
        var modalPage = homePage.clickEntryAdPage();
        modalPage.closeTheModal();
        assertEquals(modalPage.getEtryAdHeaderText(), "Entry Ad", "Entry Ad page header is wrong");
    }
}
