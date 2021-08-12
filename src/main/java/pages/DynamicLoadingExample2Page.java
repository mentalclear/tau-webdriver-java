package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingExample2Page {

    private WebDriver driver;
    private By startButton = By.cssSelector("div#start>button");
    private By loadedText = By.id("finish");

    public DynamicLoadingExample2Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStart(){
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);

        // My Solution - equally working
        // wait.until(ExpectedConditions.visibilityOfElementLocated(loadedText));

        // Angie's solution
        wait.until(ExpectedConditions.presenceOfElementLocated(loadedText));
    }

    public String getLoadedText(){
        return  driver.findElement(loadedText).getText();
    }

    // Chapter 11 challenge - Dmitrii
    public boolean isStartButtonDisplayed(){
        return driver.findElement(startButton).isDisplayed();
    }
}
