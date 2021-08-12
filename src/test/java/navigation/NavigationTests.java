package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigator(){
        homePage.clickDynamicLoading().clickExample1();

        // This is now accessible due to a method in
        // the BaseTests class
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }

    @Test
    public void testSwitchTabAndStartButton(){
        var startButtonPage = homePage.clickDynamicLoading().openNewTabExample2();
        getWindowManager().switchToTabIndex(1);
        assertTrue(startButtonPage.isStartButtonDisplayed(), "Start button is not displayed");
    }
}
