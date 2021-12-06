package AmuthanJava8Playlist.FunctionalInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class funcMain {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.out.println("Generic Interface methods ");

        genericInterface<String> test = s -> System.out.println("This is the " + s);
        test.printValue("Earth");

        new WebDriverWait(driver,5).until(d -> {
            d.findElement(By.xpath("test")).click();
            return "test";
        });
    }
}
