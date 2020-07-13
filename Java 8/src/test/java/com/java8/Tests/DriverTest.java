package com.java8.Tests;

import Pages.DemoPage;
import Supplier.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import java.util.List;
import java.util.function.Predicate;

import PredicateAndFunction.Rules;

public class DriverTest {


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

    @Test(priority = 0,enabled = false)
    public void GoogleTest(){

        //Example of consumer
//        driver.findElements(By.tagName("a"))
//                .forEach(e -> System.out.println(e.getText()));

        List<WebElement> links = driver.findElements(By.tagName("a"));

        //checking is the link is blank

        System.out.println("Total Links before :: " + links.size());

        //removing empty link by passing predicate

        Rules.get().forEach(links::removeIf);

        System.out.println("Total links after ::" + links.size());

        links.forEach(e -> System.out.println( e.getText()));


    }

    @Test(priority=1,enabled = false)
    public void LinkTestUsingStreams(){


        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("<<<<<<<<<<<<Using Stream >>>>>>>>>>>>>>");

        links.stream()
                .map(WebElement::getText)
                .filter(e -> e.trim().length() > 0)
                .filter(e -> !e.toLowerCase().contains("s"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }



    @AfterMethod
    public void quitBrowser(){

//        driver.quit();
    }
}
