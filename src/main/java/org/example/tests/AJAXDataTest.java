package org.example.tests;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class AJAXDataTest extends BaseTest{

    Logger loggerAJAXData = LogManager.getLogger(AJAXDataTest.class);

    @Test
    @Description("Проверка отработки AJAX запросов")
    @Epic("AJAXTEST")
    public void ajaxTest(){

        homePage.redirectToSection("AJAX Data");

        loggerAJAXData.info("test page is AJAX Data");

        ajaxDataPage.startAjaxJob();
        Selenide
                .Wait()
                .withTimeout(Duration.ofSeconds(20))
                .until(ExpectedConditions.invisibilityOf(ajaxDataPage.getSpinner()));

        ElementsCollection actualData = ajaxDataPage.getDataLoaded();
        Assert.assertFalse(actualData.isEmpty());

        ajaxDataPage.startAjaxJob();
        Selenide
                .Wait()
                .withTimeout(Duration.ofSeconds(20))
                .until(ExpectedConditions.invisibilityOf(ajaxDataPage.getSpinner()));

        ElementsCollection actualData1 = ajaxDataPage.getDataLoaded();
        Assert.assertEquals(actualData1.size(),2);
    }
}
