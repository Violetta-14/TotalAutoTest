package org.example.tests;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AlertsTest extends BaseTest{

    Logger loggerAlerts = LogManager.getLogger(AlertsTest.class);

    @Test
    @Description("Проверка отработки Alert запросов")
    @Epic("ALERTSTEST")
    public void touchAlert(){

        homePage.redirectToSection("Alerts");

        //getScreenshot();

        alertsPage.clickPromptButton();

        final String inputText = "TestAlert";

        loggerAlerts.info("test words is {}", inputText);
        String expectedText = "User value: %s".formatted(inputText);

        alertsPage.setTextToAlert(inputText);
        alertsPage.confirmAlert();

        Selenide.sleep(6000);
        Selenide.Wait().until(ExpectedConditions.alertIsPresent());

        String actualText = alertsPage.getTextFromAlert();
        alertsPage.confirmAlert();

        Assert.assertEquals(actualText, "test");
                //expectedText
    }
}
