package Supplier;

import com.google.common.base.Supplier;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class DriverFactory {

    private static final Supplier<WebDriver> chromeSupplier = () -> {

        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    };

    private static final Supplier<WebDriver> fireFoxSupplier = () -> {

        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    };

    private static Map<String, Supplier<WebDriver>> MAP = new HashMap<>();

    static{
        MAP.put("Chrome", chromeSupplier);
        MAP.put("Firefox", fireFoxSupplier);
    }

    // Initializing the driver on call
    public static WebDriver getDriver(String browser){

        return MAP.get(browser).get();
    }
 }

