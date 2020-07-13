package com.java8.Tests;

import Pages.DemoPage;
import PredicateAndFunction.SearchCriteriaFactory;
import Supplier.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import javax.management.ObjectName;
import java.util.List;
import java.util.function.Predicate;

public class checkBoxTest {

    private WebDriver driver;
    private DemoPage demoPage;


    @BeforeMethod
    @Parameters("Browser")
    public void setDriver(@Optional("Chrome") String browser){

        driver = DriverFactory.getDriver(browser);
//        driver.get("https://www.google.co.in");
//        driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-stream-table.html");
        demoPage = new DemoPage(driver);

    }

    @Test(dataProvider = "searchCriteria")
    public void SelectingCheckBoxes(Predicate<List<WebElement>> searchCriteria){
        demoPage.goTo();
        demoPage.getRowsPredicate(searchCriteria);
    }

    @DataProvider(name = "criteriaProvider")
    public Object[] getData(){
        Predicate<List<WebElement>> allMale = (element) -> element.get(1).getText().equalsIgnoreCase("male");
        Predicate<List<WebElement>> allFemale = (element) -> element.get(1).getText().equalsIgnoreCase("female");
        Predicate<List<WebElement>> australia = (element) -> element.get(2).getText().equalsIgnoreCase("au");
        Predicate<List<WebElement>> femaleUSA = allFemale.and(australia);
        return new Object[]{
                allFemale,
                allMale,
                australia,
                femaleUSA
        };
    }

    @DataProvider(name = "searchCriteria")
    public Object[] getSearchCriteria(){

        return new Object[]{
                SearchCriteriaFactory.getCriteria("allmale"),
                SearchCriteriaFactory.getCriteria("allfemale"),
                SearchCriteriaFactory.getCriteria("australia"),
        };
    }

    @AfterMethod
    public void quit(){

        this.driver.quit();
    }
}
