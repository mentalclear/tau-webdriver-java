package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By slider = By.cssSelector("div.sliderContainer>input");
    private By rangeResult = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setSliderToValue(String value){
        // Dmitrii's solution - had a problem: too much hardcoded!
        // also used int for value.
//        driver.findElement(slider).click();  // Turns out not necessary
//        for(int i = 0; i < value-1; i++)
//            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);

        // Angie's solution
        while(!getResultValue().equals(value)){
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getResultValue(){
        return driver.findElement(rangeResult).getText();
    }

}
