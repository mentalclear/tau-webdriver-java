package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EntryAdPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By modalCloseLink = By.cssSelector("div.modal-footer>p");
    private By entryAdHeader = By.cssSelector("div.example h3");

    public EntryAdPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void closeTheModal(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(modalCloseLink));
        driver.findElement(modalCloseLink).click();
    }

    public String getEtryAdHeaderText(){
        return driver.findElement(entryAdHeader).getText();
    }
}
