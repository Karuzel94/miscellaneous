package misc_exercises.mercury.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends AbstractPage {

    public Home(WebDriver driver){
        super(driver);
    }


    @FindBy(linkText = "Home")
    WebElement home;

    @FindBy(linkText = "Our Coaches")
    WebElement coaches;

    @FindBy(xpath = "//div[@id='Navagation']/strong/a[3]/span")
    WebElement contact;

    @FindBy(xpath = "//*[@id='Navagation']/strong/a[4]/span")
    WebElement sf;

    @FindBy(linkText = "Specialized Tours")
    WebElement tours;

    public void clickHome(){
        click(home);
    }

    public void clickCoaches(){
        click(coaches);
    }
    public void clickContact(){
        click(contact);

    }
    public void clickSF(){
        click(sf);

    }
    public void clickSpecializedTours(){
        click(tours);

    }


}
