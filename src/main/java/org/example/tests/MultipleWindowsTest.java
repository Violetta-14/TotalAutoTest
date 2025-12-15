package org.example.tests;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindowsTest extends BaseTest{



    @Test
    public void multipleWindowTest(){

        String playGrHandle = getWebDriver().getWindowHandle();

        getWebDriver().switchTo().newWindow(WindowType.TAB);
        getWebDriver().get("https://google.com/");
        String googleHandle = getWebDriver().getWindowHandle();

        Set<String> brouserTabs = getWebDriver().getWindowHandles();
        //getWebDriver().switchTo().window("File Upload");//ненадежно
        getWebDriver().switchTo().window(playGrHandle);
        homePage.redirectToSection("File Upload");
        System.out.println("test");
    }
}
