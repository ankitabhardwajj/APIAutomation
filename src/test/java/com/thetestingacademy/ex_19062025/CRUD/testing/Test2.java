package com.thetestingacademy.ex_19062025.CRUD.testing;

import org.junit.jupiter.api.Test;
import org.testng.annotations.*;

public class Test2 {

    @BeforeSuite
     void demo1(){
        System.out.println("before suite");
    }

    @BeforeTest
     void demo2(){
        System.out.println("before test");

    }

    @BeforeClass
    void demo3(){
        System.out.println("before class");
    }

    @BeforeMethod
    void demo4(){
        System.out.println("before method");
    }

    @Test
    void demo5(){
        System.out.println("test");
    }

    @AfterMethod
    void demo6(){
        System.out.println("after method ");
    }

    @AfterClass
    void demo7(){
        System.out.println("after class");
    }

    @AfterTest
    void demo8(){
        System.out.println("after test");
    }

    @AfterSuite
    void demo9(){
        System.out.println("after suite");
    }




}
