package com.java8.Tests;

import Assignments.SalePage;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class PaymentActions {

    public static final Consumer<SalePage> FreePromo = p -> p.addCouponCode("FREEUDEMY");
    public static final Consumer<SalePage> partialUdemy  = p -> p.addCouponCode("PARTIALUDEMY");
    public static final Consumer<SalePage> validCreditNumber = p -> p.enterCC("4111111111111111","2024","123");
    public static final Consumer<SalePage> invalidCreditNumer = p -> p.enterCC("41111111111111122","2024","123");
    public static final Consumer<SalePage> buyNow = SalePage::BuyNow;

    //Validations
    public static final Consumer<SalePage> successFullPurchase = p -> Assert.assertEquals(p.checkStatus(),"PASS");
    public static final Consumer<SalePage> FailedPurchase = p -> Assert.assertEquals(p.checkStatus(),"FAIL");



}
