package forgot;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailRetrievalConfirmPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.assertTrue;


public class ForgotEmailTest extends BaseTests {
    @Test
    public void testSuccessfulEmailRetrieval() {
        var forgotPasswordPage = homePage.clickForgotPassword();

        forgotPasswordPage.submitEmailAddress("tau@example.com");
        var emailRetrievalConfirmPage = forgotPasswordPage.clickRetrievePassword();
        assertTrue(emailRetrievalConfirmPage.getReplyText().contains(
                "Internal Server Error"), "This crappy site is actually working!");
    }
}
