package com.thetestingacademy.ex_20062025_testngexamples;

import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeTest;

public class testNG003 {
    @BeforeTest
    public void getToken(){
        System.out.println("1");
    }

    @BeforeTest
    public void getBookingId(){
        System.out.println("2");
    }

    @Test
    public void t3(){
        System.out.println("3");
    }
}
