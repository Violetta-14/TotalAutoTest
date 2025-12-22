package org.example.tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import java.util.Set;


public class MultipleWindowsTest extends BaseTest{

    Logger loggerMultipleWindows = LogManager.getLogger(MultipleWindowsTest.class);

    @Test
    @Description("Проверка отработки Multiple Windows запросов")
    @Epic("MULTIPLEWINDOWSTEST")
    public void multipleWindowTest(){

        loggerMultipleWindows.info("test page is Multiple Windows");

        WebDriver driver = WebDriverRunner.getWebDriver();
        String playGrHandle = driver.getWindowHandle();

        Selenide.switchTo().newWindow(WindowType.TAB);
        Selenide.open("https://google.com/");
        String googleHandle = driver.getWindowHandle();

        Set<String> brouserTabs = driver.getWindowHandles();
        //getWebDriver().switchTo().window("File Upload");//ненадежно
        Selenide.switchTo().window(playGrHandle);
        homePage.redirectToSection("File Upload");
        Selenide.closeWindow();
        System.out.println("test");
    }
}
