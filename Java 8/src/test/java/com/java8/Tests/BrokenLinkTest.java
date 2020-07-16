package com.java8.Tests;

import Pages.DemoPage;
import Supplier.DriverFactory;
import Util.LinkUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

public class BrokenLinkTest {

    private WebDriver driver;
    private DemoPage demoPage;
    private LinkUtil linkUtil;


    @BeforeMethod
    @Parameters("Browser")
    public void setDriver(@Optional("Chrome") String browser){

        driver = DriverFactory.getDriver(browser);
        driver.get("https://the-internet.herokuapp.com/broken_images");
        demoPage = new DemoPage(driver);
    }
//
//    @Test(enabled = false)
//    public void BrokenLinkTest(){
//
//        driver.findElements(By.xpath("//*[@src]"))
//                .stream()
//                .map(s -> s.getAttribute("src"))
//                .forEach(src -> {
//                    System.out.println(LinkUtil.getResponseCode(src) + "::" + src);
//                });
//    }

    @Test(priority = 1)
    public void BrokenListAssertion(){
        List<String> result = driver.findElements(By.xpath("//*[@src]"))
                .stream()
                .map(s -> s.getAttribute("src"))
                .filter(src -> LinkUtil.getResponseCode(src) !=200)
                .collect(Collectors.toList());

        Assert.assertEquals(result.size(),0,result.toString());
    }

}
