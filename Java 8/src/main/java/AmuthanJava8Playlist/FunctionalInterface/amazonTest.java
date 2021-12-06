package AmuthanJava8Playlist.FunctionalInterface;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class amazonTest {

    static  WebDriver driver;
    static WebDriverWait webDriverWait;

    @Test
    public void amazonTest(){
        String menuPath = "//div[text()='%s']/parent::a";
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://amazon.in");
       driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();

        Click(driver,"xpath",String.format(menuPath,"Amazon Prime Video"));
    }

    public static void Click(WebDriver driver,String locator, String value) {
        By by = LocatorFactory.getLocator(locator,value);
        driver.findElement(by).click();
    }


}
