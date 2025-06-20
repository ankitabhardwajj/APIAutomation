package com.thetestingacademy.ex_20062025_testngexamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testNG008 {
        @Test
        public void test01() {
            Assert.assertTrue(true);
        }

        @Test(enabled = false)
        public void test02() {
            Assert.assertTrue(false);
        }

        @Test(alwaysRun = true)
        public void test03() {
            Assert.assertTrue(true);
        }
    }
