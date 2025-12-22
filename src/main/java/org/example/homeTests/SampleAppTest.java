package org.example.homeTests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SampleAppTest extends BaseTest {

    Logger loggerSampleApp = LogManager.getLogger(SampleAppTest.class);

    @Test
    @Description("Проверка отработки Sample App запросов")
    @Epic("SAMPLEAPPTEST")
    public void testSampleApp() {

        homePage.redirectToSection("Sample App");

        loggerSampleApp.info("test page is Sample App");

        sampleAppPage.clickLogInButton();
        String buttonText = sampleAppPage.getTextFromCheckLine();

        Assert.assertTrue(buttonText.contains("Invalid username/password"));
        System.out.println("Текущий текст кнопки: " + buttonText);


        sampleAppPage.fillUserName("TEST2");
        sampleAppPage.clickLogInButton();
        String buttonText2 = sampleAppPage.getTextFromCheckLine();

        Assert.assertTrue(buttonText2.contains("Invalid username/password"));
        System.out.println("Текущий текст кнопки: " + buttonText2);


        sampleAppPage.fillUserName("TEST3");
        sampleAppPage.fillPassword("pwd");
        sampleAppPage.clickLogInButton();
        String buttonText3 = sampleAppPage.getTextFromCheckLine();

        Assert.assertTrue(buttonText3.contains("Welcome"));
        System.out.println("Текущий текст кнопки: " + buttonText3);
    }
}

