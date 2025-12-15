package org.example.tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import java.util.Set;

public class MultipleWindowsTest extends BaseTest{



    @Test
    public void multipleWindowTest(){

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
