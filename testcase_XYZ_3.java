package misc_exercises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class testcase_XYZ_3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver w = new ChromeDriver();
        w.manage().window().maximize();
        w.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String logInData = "bggtest1221";
        //IMPORTANT!!!! Delete all products from wishlist and collections before performing the test!

        w.get("https://boardgamegeek.com/");
        //opening the log in form
        w.findElement(By.xpath("/html/body/gg-app/div/gg-header/header/nav/div/div[1]/div/div[2]/gg-menu-nav-nouser/ul/li[1]/a")).click();

        //IMPORTANT!!!! Delete all products from wishlist and collections before performing the test!

        //entering data to log in form and confirmation
        w.findElement(By.xpath("//*[@id='inputUsername']")).sendKeys(logInData);
        w.findElement(By.cssSelector("#inputPassword")).sendKeys(logInData);
        w.findElement(By.xpath("//button[contains(text(),' Sign In ')]")).click();

        //IMPORTANT!!!! Delete all products from wishlist and collections before performing the test!

        //Adding products to "Wishlist" in two ways, the 1st way
        //browsing to "all boardgames" in "Browse" dropdown menu
        Thread.sleep(2000);
        w.findElement(By.xpath("/html/body/gg-app/div/gg-header/header/nav/div/div[1]/div/div[1]/ul/li[1]/button")).click();
        w.findElement(By.xpath("//*[@class='c-nav-primary-wrapper']/div/ul/li[1]/div/div/div/div[1]/span[1]/a")).click();
        //moving to the product-page of first product on list
        w.findElement(By.xpath("//*[@id='results_objectname1']/a")).click();

        //addind to "wishlist"
        //clicking the button "Add to collection", choosing the wishlist with a checkbox and applying by "Save" btn
        Thread.sleep(1000);
        w.findElement(By.xpath("//div[@class='toolbar-action']/span/span[2]/span/span/span/button")).click();
        Thread.sleep(1000);
        w.findElement(By.xpath("//*[@item='editctrl.editdata.item']/div[2]/div[4]/label/input")).click();
        Thread.sleep(1000);
        w.findElement(By.xpath("//*[@ng-if='!editctrl.errorinfo.error']/button[1]")).click();
        //reloading to mainpage
        w.findElement(By.xpath("//*[@class='global-header-logo-symbol']")).click();

        //Adding products to "Wishlist" in two ways, the 2nd way
        //entering the "warhammer" charSequence to the searchbar and clicking on first position on dynamic dropdown
        w.findElement(By.xpath("//div[@class='c-wrapper']/input")).sendKeys("warhammer");
        w.findElement(By.xpath("//*[@id='ngb-typeahead-0-0']/ngb-highlight/span")).click();
        //clicking the button "Add to collection", choosing the wishlist with a checkbox and applying by "Save" btn
        Thread.sleep(1000);
        w.findElement(By.xpath("//div[@class='toolbar-action']/span/span[2]/span/span/span/button")).click();
        Thread.sleep(1000);
        w.findElement(By.xpath("//*[@item='editctrl.editdata.item']/div[2]/div[4]/label/input")).click();
        Thread.sleep(1000);
        w.findElement(By.xpath("//*[@ng-if='!editctrl.errorinfo.error']/button[1]")).click();
        Thread.sleep(1000);
        //reloading to mainpage
        w.findElement(By.xpath("//*[@class='global-header-logo-symbol']")).click();

        //checking the wishlist
        w.findElement(By.xpath("//*[@class='c-nav-primary-user']/gg-menu-nav-user/ul/li[2]/gg-my-geek/div/button/span[2]")).click();
        w.findElement(By.xpath("//*[@class='c-nav-primary-user']/gg-menu-nav-user/ul/li[2]/gg-my-geek/div/div/div/div[2]/a[2]")).click();
        //thread.sleep for have some time to see the wishlist
        Thread.sleep(1000);

        //logout
        w.findElement(By.xpath("//*[@id='global-header-outer']/header/nav/div/div[2]/div/div[1]/ul/li[8]/button/span[2]")).click();
        w.findElement(By.xpath("//*[@id='global-header-outer']/header/nav/div/div[2]/div/div[1]/ul/li[8]/div/ul[2]/li[9]/a")).click();


        //log in again to check the wishlist after logout, log out from service and turn off the browser
        w.findElement(By.xpath("/html/body/gg-app/div/gg-header/header/nav/div/div[1]/div/div[2]/gg-menu-nav-nouser/ul/li[1]/a")).click();
        w.findElement(By.xpath("//*[@id='inputUsername']")).sendKeys(logInData);
        w.findElement(By.cssSelector("#inputPassword")).sendKeys(logInData);
        w.findElement(By.xpath("//button[contains(text(),' Sign In ')]")).click();
        //checking the wishlist
        w.findElement(By.xpath("//*[@class='c-nav-primary-user']/gg-menu-nav-user/ul/li[2]/gg-my-geek/div/button/span[2]")).click();
        w.findElement(By.xpath("//*[@class='c-nav-primary-user']/gg-menu-nav-user/ul/li[2]/gg-my-geek/div/div/div/div[2]/a[2]")).click();
        //thread.sleep for have some time to see the wishlist
        Thread.sleep(1000);
        //logout
        w.findElement(By.xpath("//*[@id='global-header-outer']/header/nav/div/div[2]/div/div[1]/ul/li[8]/button/span[2]")).click();
        w.findElement(By.xpath("//*[@id='global-header-outer']/header/nav/div/div[2]/div/div[1]/ul/li[8]/div/ul[2]/li[9]/a")).click();

        //closing Chrome window
        w.close();






    }
}
