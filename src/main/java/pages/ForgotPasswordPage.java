package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    public WebDriver driver;
    private By emailField = By.id("email");
    private By retrievePasswordButton = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    // Fill the email address field
    public void submitEmailAddress(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public EmailRetrievalConfirmPage clickRetrievePassword(){
        driver.findElement(retrievePasswordButton).click();
        return new EmailRetrievalConfirmPage(driver);
    }
}
