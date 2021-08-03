package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import pages.HomePage;


public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage; // HomePage handle

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        homePage = new HomePage(driver); // Instantiated HomePage handle
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}