package com.java8.Tests;

import Assignments.SalePage;
import Assignments.TablePage;
import PredicateAndFunction.SearchCriteriaFactory;
import Supplier.DriverFactory;
import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import static com.java8.Tests.PaymentActions.*;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class SalePageTest {


    WebDriver driver;
    SalePage salePage;

    @BeforeTest
    @Parameters("Browser")
    public void setDriver(@Optional("Chrome") String browser) {

        driver = DriverFactory.getDriver(browser);
        driver.manage().window().maximize();
         salePage = new SalePage(driver);

    }


    @Test(dataProvider = "creteriaProvider")
    public void PerformPurchase(Consumer<SalePage> consumer){
       salePage.Goto();
       consumer.accept(salePage);

        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
    }

    @DataProvider(name = "creteriaProvider")
    public Object[] getData(){
        return new Object[]{
                validCreditNumber.andThen(buyNow).andThen(successFullPurchase),
                invalidCreditNumer.andThen(buyNow).andThen(FailedPurchase),
                FreePromo.andThen(buyNow).andThen(successFullPurchase),
                partialUdemy.andThen(validCreditNumber).andThen(buyNow).andThen(successFullPurchase),
                invalidCreditNumer.andThen(FreePromo).andThen(buyNow).andThen(successFullPurchase),
                buyNow.andThen(FailedPurchase)
        };
    }


}
