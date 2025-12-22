package org.example.homeTests;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Pages.AlertsPage;
import org.example.tests.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


public class HomeAlertsTest extends BaseTest {

    Logger loggerHomeAlerts = LogManager.getLogger(HomeAlertsTest.class);

    @Test
    @Description("Проверка отработки Alert запросов")
    @Epic("ALERTSTEST")
    public void checkAlert(){

        homePage.redirectToSection("Alerts");

        loggerHomeAlerts.info("test page is Alerts");

        alertsPage.clickConfirmButton();
        if (AlertsPage.checkFriday()){
            alertsPage.confirmAlert();
            System.out.println("Today is friday");
        }else {
            alertsPage.dismissAlert();
            System.out.println("Today is not friday");
        }

        Selenide.sleep(6000);
        Selenide.Wait().until(ExpectedConditions.alertIsPresent());

        alertsPage.confirmAlert();
        System.out.println("End of test");
    }
}

