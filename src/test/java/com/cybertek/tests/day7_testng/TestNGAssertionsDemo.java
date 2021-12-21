package com.cybertek.tests.day7_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionsDemo {

    @Test
    public void test1(){
        Assert.assertEquals("title", "title");

    }

    @Test
    public void test2(){

        String email="john@smith.com";

        Assert.assertTrue(email.contains("@"), "verify message contains @");

    }



}
