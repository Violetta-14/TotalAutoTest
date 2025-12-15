package org.example.tests;

import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class MouseOverTest extends BaseTest{

    @Test
    public void mouseTest() throws IOException {
        Selenide.open(runProperties.getProperty("baseUrl")); //???????

        homePage.redirectToSection("Mouse Over");

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
