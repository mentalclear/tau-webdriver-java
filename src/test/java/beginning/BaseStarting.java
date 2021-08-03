package beginning;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseStarting {
    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        //driver.manage().window().maximize();
        //driver.manage().window().fullscreen(); // Full screen if needed.
        // Mobile device size based on Chrome Devtools mobile device suggestion.
        driver.manage().window().setSize(new Dimension(375, 812));

        // Multiple items
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        // Returns first and single element
        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        inputsLink.click();

        System.out.println(driver.getTitle());
        driver.quit();
    }

    public void exerciseChapt3() {
        System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement linkShiftingContent = driver.findElement(By.linkText("Shifting Content"));
        linkShiftingContent.click();

        WebElement linkExample1MenuElement = driver.findElement(By.linkText("Example 1: Menu Element"));
        linkExample1MenuElement.click();

        List<WebElement> contentLinks = driver.findElements(By.tagName("li"));
        System.out.println(contentLinks.size());

        driver.quit();
    }

    public static void main(String[] args) {
        BaseStarting test = new BaseStarting();
        //test.setUp();
        test.exerciseChapt3();
    }
}