package com.thetestingacademy.ex_20062025_testngexamples;


import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeTest;

public class testNG002 {
    String token;
    int bookinid;

    @BeforeTest
    public String getToken() {
        token = "123";
        return token;
    }

    @BeforeTest
    public void getTokenAndBookingId(){
        token = getToken();
        bookinid = 123;
    }


    @Test
    public void testPUTRequest(){
        System.out.println(token);
        System.out.println(bookinid);
    }

    @Test
    public void testPUTRequest2(){
        System.out.println(token);
        System.out.println(bookinid);
    }

    @Test
    public void testPUTRequest3(){
        System.out.println(token);
        System.out.println(bookinid);
    }
}
