package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

// Extends the base test class that is used for
// driver setup and so on
public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin(){
        // Method returns a LoginPage object so we are creating
        // a reference here.
      LoginPage loginPage = homePage.clickFormAuthentication();

      // Interactions by using methods on LoginPage fields:
      loginPage.setUsername("tomsmith");
      loginPage.setPassword("SuperSecretPassword!");

      // Again after taken to another page - get a reference
      SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
      secureAreaPage.getAlertText();
      assertTrue(secureAreaPage.getAlertText()
                      .contains("You logged into a secure area!"),
              "Alert text is incorrect");
    }
}
