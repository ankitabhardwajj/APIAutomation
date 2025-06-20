package com.thetestingacademy.ex_20062025_testngexamples;

import org.apache.http.conn.util.PublicSuffixList;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testNG007 {
    @Test
    public void test01(){
        Assert.assertTrue(true);
    }

    @Test(enabled = false)
    public void test02(){
        Assert.assertTrue(false);
    }

    @Test
    public void test03(){
        Assert.assertTrue(true);
    }
}
