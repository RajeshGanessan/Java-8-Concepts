package AmuthanJava8Playlist.FunctionIn;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webdriverWaitSample {

    public static void main(String[] args) {

        System.out.println("lambda is webdriver wait function");

        WebDriverManager.chromedriver().setup();
        WebDriver driver =  new ChromeDriver();

        driver.get("https://google.com");
        new WebDriverWait(driver, 5).until(d->{

        })
    }
}
