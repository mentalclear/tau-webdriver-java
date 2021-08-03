package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
    // POM for HomePage.
    // Rule of thumb - Start with minimum required and add later
    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");

    // Constructor that accepts the driver as a parameter
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    // Click on the chosen element, if it takes to a new page
    // the method must return a new page, in this case LoginPage.
    public LoginPage clickFormAuthentication(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }
}
