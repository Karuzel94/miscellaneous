package misc_exercises.mercury.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Specialized_Tours extends BasePage {
    


    public Specialized_Tours(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Home']")
    WebElement home;

    @FindBy(xpath = "//span[text()='Our Coaches']")
    WebElement coaches;

    @FindBy(xpath = "//span[text()='Contact Us']")
    WebElement contact;

    @FindBy(xpath = "//a[@href='Contact_Us.html']")
    WebElement sf;

    @FindBy(xpath = "//span[text()='Specialized Tours']")
    WebElement tours;

    @FindBy(xpath = "//a[text()='More Of Where We Go....']")
    WebElement more;

    public void clickHome(){
        home.click();
    }

    public void clickCoaches(){
        coaches.click();
    }
    public void clickContact(){
        contact.click();

    }
    public void clickSF(){
        sf.click();

    }
    public void clickSpecializedTours(){
        tours.click();
    }

    public  void clickMore(){
        more.click();
    }

}
