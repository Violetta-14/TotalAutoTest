package org.example.tests;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;


public class MouseOverTest extends BaseTest{

    Logger loggerMouseOver = LogManager.getLogger(MouseOverTest.class);

    @Test
    @Description("Проверка отработки Mouse Over запросов")
    @Epic("MOUSEOVERTEST")
    public void mouseTest() throws IOException {

        Selenide.open(runProperties.getProperty("baseUrl"));

        homePage.redirectToSection("Mouse Over");

        loggerMouseOver.info("test page is Mouse Over");

        String titleBefore = mouseOverPage.getClickMeAttribute("title");
        mouseOverPage.hoverClickMeButton();
        String titleAfter = mouseOverPage.getClickMeAttribute("title");
        Assert.assertNotEquals(titleBefore, titleAfter);

        final int clickCount = 1;
       // int initialClick = Integer.valueOf(mouseOverPage.getClickCount());
        mouseOverPage.doubleClick(clickCount);

        int actualClickCount = Integer.valueOf(mouseOverPage.getClickCount());
        Assert.assertTrue(actualClickCount == clickCount * 2);
        System.out.println("test");
    }
}
