package misc_exercises.mercury.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage {

    protected WebDriver driver;
    protected WebElement element;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

}
