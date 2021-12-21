package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyConfirmationMessage {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInputBox= driver.findElement(By.name("email"));
        String exceptedemail="mike@smith.com";
        emailInputBox.sendKeys(exceptedemail);

        String actualEmail=emailInputBox.getAttribute("value");

        if(exceptedemail.equals(actualEmail)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        Thread.sleep(3000);

        WebElement actualConfirmationMessage= driver.findElement(By.name("confirmation_message"));
        System.out.println(actualConfirmationMessage.getText());

        String expectedMessage="Your e-mail's been sent!";
        String actualMessage=actualConfirmationMessage.getText();

        if(expectedMessage.equals(actualMessage)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }




    }
}
