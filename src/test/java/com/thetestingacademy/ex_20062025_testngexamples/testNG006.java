package com.thetestingacademy.ex_20062025_testngexamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNG006 {
    @Parameters("browser")
    @Test
    void demo1(String value){
        System.out.println("browser is" +value);
    }
}
