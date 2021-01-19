package misc_exercises.mercury.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class More extends AbstractPage{

    public More(WebDriver driver){
        super(driver);
    }

    @FindBy(linkText = "Return to Specialized Tours")
    WebElement ret;

    public void clickReturn(){
        click(ret);
    }


}
