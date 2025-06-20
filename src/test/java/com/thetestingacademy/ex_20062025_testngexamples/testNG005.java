package com.thetestingacademy.ex_20062025_testngexamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testNG005 {

    @Test (groups = {"sanity", "QA", "e2e"})
    public void sanityRun(){
        System.out.println("sanity");
        System.out.println("QA");
    }


    @Test (groups = {"QA"})
    public void ragRun(){
        System.out.println("rag");
    }
    @Test(groups = {"dev"})
    public void SmokeRun(){
        System.out.println("smoke");
        Assert.assertTrue(true,"failed");
    }
}
