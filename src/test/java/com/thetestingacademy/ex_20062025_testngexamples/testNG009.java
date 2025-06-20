package com.thetestingacademy.ex_20062025_testngexamples;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testNG009 {
    @Test
    public void HardAssertExample(){
        Assert.assertTrue(false);
        System.out.println("this will be executed");
    }

    @Test
    public void SoftAssertExample(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(false);
        System.out.println("this will be executed");
        softAssert.assertAll();

    }
}
