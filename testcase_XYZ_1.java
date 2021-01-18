package misc_exercises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class testcase_XYZ_1 {

    public static String randomString(int len) {
        char[] str = new char[100];
        for (int i = 0; i < len; i++) {
            str[i] = (char) (((int) (Math.random() * 26)) + (int) 'A');
        }
        return (new String(str, 0, len));
    }

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver w = new ChromeDriver();
        w.manage().window().maximize();
        w.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(w, 5);

        //registration data
        String username = randomString(8);
        String mail = randomString(7);
        String password = randomString(8);

        w.get("https://boardgamegeek.com/");
        w.findElement(By.xpath("/html/body/gg-app/div/gg-header/header/nav/div/div[1]/div/div[2]/gg-menu-nav-nouser/ul/li[2]/a")).click();

        //Registration form
        w.findElement(By.cssSelector("#join-username")).sendKeys(username);
        w.findElement(By.id("join-email")).sendKeys(mail + "@gmail.com");
        w.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
        w.findElement(By.xpath("//button[contains(text(),' Create an Account ')]")).click();


        //skipping additional account settings,waiting for showing this additional form
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='btn-row']/button[1]")));

        Wait<WebDriver> wait2 = new FluentWait<WebDriver>(w)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);

        WebElement skip = wait2.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                if (driver.findElement(By.xpath("//div[@class='btn-row']/button[1]")).isDisplayed()) {
                    return driver.findElement(By.cssSelector("[id='finish] h4"));
                } else {
                    return null;
                }
            }
        });

        w.findElement(By.xpath("//div[@class='btn-row']/button[1]")).click();

        //Log out from webpage
        w.findElement(By.xpath("//*[@placement='bottom-right']/button/span[2]")).click();
        w.findElement(By.xpath("//div[@class='row']/div[2]/a[9]")).click();

        System.out.println("THE NEW ACCOUNT DATA BELOW!!!");
        System.out.println("Username: " + username);
        System.out.println("Email: " + mail + "@gmail.com");
        System.out.println("Password: " + password);

        //closing Chrome window
        w.close();
    }

}
