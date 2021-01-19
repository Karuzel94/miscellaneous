package misc_exercises.mercury.Tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import misc_exercises.mercury.Pages.Home;
import misc_exercises.mercury.Pages.More;
import misc_exercises.mercury.Pages.Specialized_Tours;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    String url = "http://www.mercury-tours.com/";
    WebDriver driver;
    public Home home;
    public Specialized_Tours specialized_tours;
    public More more;

    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        home = new Home(driver);
    }

    @BeforeEach
    static void sessionStart() {
        setup();
        driver.get(url);
        driver.manage().window().maximize();
    }
    @AfterEach
    void sessionStop() {
        driver.quit();
        System.out.println("session stopped.");
    }


}
