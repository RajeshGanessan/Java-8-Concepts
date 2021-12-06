package AmuthanJava8Playlist.consumerInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consumerTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        System.out.println("Using consumer interface");

        List<String> items = Arrays.asList("apple","Orange","Mango");

        Consumer<String> toUpperCase = String::toUpperCase;
        Consumer<String> printToConsole = s -> s.toUpperCase();

        items.forEach(printToConsole.andThen(toUpperCase));
        WebElement test = driver.findElement(By.xpath("//a"));

        selectValueFromDropDown(e-> e.selectByValue("hellow"),test);

    }
    private static void selectValueFromDropDown( Consumer<Select> consumer, WebElement element){
        consumer.accept(new Select(element));
    }


}
