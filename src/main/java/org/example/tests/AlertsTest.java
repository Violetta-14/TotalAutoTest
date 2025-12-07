package org.example.tests;

import org.example.Pages.AlertsPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

//public class AlertsTest extends BaseTest{

//    @Test
//    public void touchAlert(){
//        homePage.redirectToSection("Alerts");
//
//        alertsPage.clickPromptButton();
//
//
//
//        final String inputText = "TestAlert";
//        String expectedText = "User value: %s".formatted(inputText);
//
//        alertsPage.setTextToAlert(inputText);
//        alertsPage.confirmAlert();
//
//        WebDriverWait wait = new WebDriverWait(getWebDriver(), Duration.ofSeconds(6));
//        wait.until(ExpectedConditions.alertIsPresent());
//
//        String actualText = alertsPage.getTextFromAlert();
//        alertsPage.confirmAlert();
//
//        Assert.assertEquals(actualText, expectedText);
//    }
//}
