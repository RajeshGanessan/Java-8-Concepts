package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalePage {

    WebDriver driver;

    @FindBy(id = "coupon")
     WebElement couponCode;

    @FindBy(id = "couponbtn")
    WebElement couponBtn;

    @FindBy(xpath = "//input[@id='cc']")
     WebElement creditNumber;

    @FindBy(id = "year")
     WebElement year;

    @FindBy(xpath = "//input[@id='cvv']")
    WebElement ccv;

    @FindBy(id = "buy")
    WebElement buyNowBtn;

    @FindBy(id = "price")
    WebElement totalPrice;

    @FindBy(id = "status")
    WebElement status;

    public SalePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void Goto(){
        driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-payment-screen.html");
    }

    public void addCouponCode(String promoCode){
        couponCode.sendKeys(promoCode);
        couponBtn.click();
    }

    public void enterCC(String CC,String yearToEnter,String cvvToEnter){
        creditNumber.sendKeys(CC);
        year.sendKeys(yearToEnter);
        ccv.sendKeys(cvvToEnter);
    }

    public void BuyNow(){
        buyNowBtn.click();
    }


    public String checkStatus(){
       return status.getText().trim();
    }

}
