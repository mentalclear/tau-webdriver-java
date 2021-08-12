package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.WindowManager;

import java.util.concurrent.TimeUnit;


public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage; // HomePage handle

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Implicit Wait on the project level set here
        // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // Page Load Timeout
        // driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        goHome();

        homePage = new HomePage(driver); // Instantiated HomePage handle
    }

    // Added this so each test would start from the same Home page location.
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    // A handle to a WindowManager to be used in other test classes
    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }
}