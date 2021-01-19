package misc_exercises.mercury.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Specialized_Tours extends AbstractPage {
    


    public Specialized_Tours(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//div[@id='Navagation']/strong/a[1]/span")
    WebElement home;

    @FindBy(xpath = "//div[@id='Navagation']/strong/a[2]/span")
    WebElement coaches;

    @FindBy(xpath = "//div[@id='Navagation']/strong/a[3]/span")
    WebElement contact;

    @FindBy(xpath = "//*[@id='Navagation']/strong/a[4]/span")
    WebElement sf;

    @FindBy(linkText = "Specialized Tours")
    WebElement tours;

    @FindBy(linkText = "More Of Where We Go....")
    WebElement more;

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

    public void clickMore(){
        click(more);
    }

}
