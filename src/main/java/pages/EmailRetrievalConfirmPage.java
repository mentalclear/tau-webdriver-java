package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailRetrievalConfirmPage {
    public WebDriver driver;
    private By internalServerError = By.xpath("//h1");

    public EmailRetrievalConfirmPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getReplyText(){
        return driver.findElement(internalServerError).getText();
    }
}
