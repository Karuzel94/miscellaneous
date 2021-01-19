package misc_exercises.mercury.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contact_Us extends AbstractPage {

    public Contact_Us(WebDriver driver){
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
}
