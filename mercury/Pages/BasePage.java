package misc_exercises.mercury.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private int time = 5;
    protected WebDriver driver;
    protected WebElement element;
    protected WebDriverWait w;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.w = new WebDriverWait(this.driver, time);
    }

    public void click(WebElement element){
        w.until(ExpectedConditions.visibilityOf(element));
        w.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

}
