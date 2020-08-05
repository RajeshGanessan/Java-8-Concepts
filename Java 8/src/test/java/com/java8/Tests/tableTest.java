package com.java8.Tests;

import Assignments.TablePage;
import Supplier.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class tableTest {

    WebDriver driver;
    TablePage tablePage;

    @BeforeMethod
    @Parameters("Browser")
    public void setDriver(@Optional("Chrome") String browser) {

        driver = DriverFactory.getDriver(browser);
        driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-stream-table-price.html");
        tablePage = new TablePage(driver);

    }

    @Test(description = "Checking the minimum price")
    public void verifyMinimumPrice(){
        tablePage.selectMinRow();
        Assert.assertEquals(tablePage.getStatus(),"PASS");
        }

}
