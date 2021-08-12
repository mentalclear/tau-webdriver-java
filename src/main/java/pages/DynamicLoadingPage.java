package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {
    private WebDriver driver;

    // A format used to work with xpath here
    private String linkXpath_Format = ".//a[contains(text(), '%s')]";
    private By link_Example1 = By.xpath(String.format(linkXpath_Format, "Example 1"));
    private By link_Example2 = By.xpath(String.format(linkXpath_Format, "Example 2"));

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoadingExample1Page clickExample1(){
        driver.findElement(link_Example1).click();
        return new DynamicLoadingExample1Page(driver);
    }

    public DynamicLoadingExample2Page clickExample2(){
        driver.findElement(link_Example2).click();
        return new DynamicLoadingExample2Page(driver);
    }

    // Chapter 11 solution - Dmitrii
    public DynamicLoadingExample2Page openNewTabExample2(){
        WebElement element = driver.findElement(link_Example2);
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL)
                .click(element)
                .keyUp(Keys.CONTROL).perform();
        return new DynamicLoadingExample2Page(driver);
    }

    // Chapter 11 solution Angie:
    public DynamicLoadingExample2Page rightClickOnExample2Link(){
        driver.findElement(link_Example2).sendKeys(Keys.CONTROL, Keys.RETURN);
        return new DynamicLoadingExample2Page(driver);
    }
}
