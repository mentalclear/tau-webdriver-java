package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {
    private WebDriver driver;
    private String editorIframeId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseIndent = By.xpath("//div[@class='tox-toolbar__group']//button[@class='tox-tbtn' and @title='Increase indent']");

    public WysiwygEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    // The idea for the method here:
    // Switch to the iframe, do what's needed and then switch back to main frame
    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToTheMainArea();
    }

    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToTheMainArea();
    }

    public void increaseIndent(){
        driver.findElement(increaseIndent).click();
    }

    // This is an internal method for this page
    // to switch context to the iframe's DOM
    private void switchToEditArea(){
        driver.switchTo().frame(editorIframeId);
    }

    // This is to switch context to main DOM
    private void switchToTheMainArea(){
        driver.switchTo().parentFrame();
    }

    public String getTextFromEditor(){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToTheMainArea();
        return text;
    }

}
