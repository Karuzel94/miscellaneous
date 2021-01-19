package misc_exercises.mercury.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AbstractPage {

    protected WebDriver driver;
    protected WebElement element;

    public AbstractPage(WebDriver driver){
        this.driver = driver;
    }

}
