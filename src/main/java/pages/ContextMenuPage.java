package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By contextBox = By.id("hot-spot");
    private By pageBody = By.cssSelector("body");

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void activateContextAlert(){
        // My solution used this one, but Angie's is shorter
       // WebElement contextBoxElement = driver.findElement(contextBox);
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(contextBox)).perform();
    }

    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }

    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }

    public void closeContextMenu(){
        driver.findElement(pageBody).click();
    }

}
