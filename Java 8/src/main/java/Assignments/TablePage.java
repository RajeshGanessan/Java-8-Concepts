package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TablePage {

    WebDriver driver;

    @FindBy(xpath = "//td[contains(@id,'prods')]")
    List<WebElement> rows;

    @FindBy(xpath = "//input[@id='result']")
    WebElement verifyButton;

    @FindBy(id = "status")
    WebElement status;

    public TablePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void selectMinRow(){
        Optional<List<WebElement>> minRow = rows.stream()
                .skip(1)
                .map(element -> element.findElements(By.tagName("td")))
                .min(Comparator.comparing(tdlist -> Integer.parseInt(tdlist.get(2).getText())));

        if(minRow.isPresent()){
            List<WebElement> cells = minRow.get();
            cells.get(3).findElement(By.tagName("input")).click();
        }
        verifyButton.click();
    }

    public String getStatus(){
        return status.getText().trim();
    }


}
