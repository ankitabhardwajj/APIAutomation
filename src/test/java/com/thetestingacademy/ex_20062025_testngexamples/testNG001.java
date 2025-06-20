package com.thetestingacademy.ex_20062025_testngexamples;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class testNG001 {



    @Test
    public void testcase01(){
        Assert.assertEquals(true,true);

    }

    @Test
    public void testcase02(){
        Assert.assertEquals(true,false);
    }
}
