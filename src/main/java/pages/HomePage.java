package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
    // POM for HomePage.
    // Rule of thumb - Start with minimum required and add later
    private WebDriver driver;

    // Constructor that accepts the driver as a parameter
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    // Click on the chosen element, if it takes to a new page
    // the method must return a new page, in this case LoginPage.
    // The locator is used only once hence no need for a separate variable
    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    // A method to click the DropDown link
    public DropDownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }

    // A method to click on a Forgot Password link
    public ForgotPasswordPage clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }


    // Generic method to click links, private to narrow the usage
    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }
}
