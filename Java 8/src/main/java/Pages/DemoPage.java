package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.function.Predicate;

public class DemoPage {

    private final WebDriver driver;

    public DemoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goTo(){
        this.driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-stream-table.html");
    }

    public void getRows(String gender){
        //List<WebElement> checkBoxes = driver.findElements(By.xpath("//td[contains(text(),'"+ gender +"')]//following-sibling::td/input"));
        List<WebElement> rows = driver.findElements(By.tagName("tr"));
        System.out.println("Selecting the checkBoxes");

        rows.stream()
                .skip(1)
                .map(tr -> tr.findElements(By.tagName("td")))
                .filter(tdElement -> tdElement.get(1).getText().equalsIgnoreCase(gender))
                .map(tdElement -> tdElement.get(3))
                .map(td -> td.findElement(By.tagName("input")))
                .forEach(WebElement::click);
    }

    //using predicate for more generic
    public void getRowsPredicate(Predicate<List<WebElement>> predicate){
        List<WebElement> rows = driver.findElements(By.tagName("tr"));
        System.out.println("Selecting the checkBoxes");

        rows.stream()
                .skip(1)
                .map(tr -> tr.findElements(By.tagName("td")))
                .filter(predicate)
                .map(tdElement -> tdElement.get(3))
                .map(td -> td.findElement(By.tagName("input")))
                .forEach(WebElement::click);
    }
}
