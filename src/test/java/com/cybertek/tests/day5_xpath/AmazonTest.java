package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://www.amazon.com/");

        WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Selenium");


        //WebElement searchButton=driver.findElement(By.id("nav-search-submit-button"));
        //searchButton.click();


        driver.findElement(By.id("nav-search-submit-button")).click();

        WebElement result= driver.findElement(By.xpath("//span[contains(text(),'results for')]"));

        String resultText= result.getText();

        System.out.println("resultText = " + resultText);

    }
}
