package org.example.homeTests;

import com.codeborne.selenide.Selenide;
import org.example.Pages.AlertsPage;
import org.example.tests.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeAlertsTest extends BaseTest {

    @Test
    public void checkAlert(){

        homePage.redirectToSection("Alerts");

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

