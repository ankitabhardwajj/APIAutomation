package com.thetestingacademy.ex_21062025.verification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class verification001 {
    @Test
    public void test_verify(){
        String responseName = "ankita";
        Assert.assertEquals("ankita", responseName);
    }
}
