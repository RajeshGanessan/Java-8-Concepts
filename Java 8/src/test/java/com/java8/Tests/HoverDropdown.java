package com.java8.Tests;

import Pages.DemoPage;
import Supplier.DriverFactory;
import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class HoverDropdown {

    WebDriver driver;
    Actions action;
    @BeforeMethod
    @Parameters("Browser")
    public void setDriver(@Optional("Chrome") String browser) {
        driver = DriverFactory.getDriver(browser);
        action = new Actions(driver);
    }

    @Test(description = "Selecting Hoverable option",dataProvider = "tranversalPath")
    public void selectFromDropDown(String path){
        driver.get("https://vins-udemy.s3.amazonaws.com/java/html/drop-down.html");
        String[] paths = path.split("=>");

        Arrays.stream(paths)
                .map(String::trim)
                .map(s -> By.linkText(s))
                .map(By -> driver.findElement(By))
                .map(element -> action.moveToElement(element))
                .forEach(Actions::perform);

        Uninterruptibles.sleepUninterruptibly(3, SECONDS);
    }

    @DataProvider(name = "tranversalPath")
    public Object[] testData(){
        return new Object[]{
                "Dropdown => Dropdown Link 2",
                "Dropdown => Dropdown Link 5 => Dropdown Submenu Link 5.2"
        };
    }
}
