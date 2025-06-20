package com.thetestingacademy.ex_20062025_testngexamples;


import org.testng.annotations.Test;

public class testNG004 {
    @Test(priority = 1)
    public void getToken(){
        System.out.println("1");
    }

    @Test(priority = 0)
    public void getBookingId(){
        System.out.println("2");
    }

    @Test(priority = 3)
    public void t3(){
        System.out.println("3");
    }
}
