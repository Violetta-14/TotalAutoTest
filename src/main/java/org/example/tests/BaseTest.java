package org.example.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Pages.AlertsPage;
import org.example.Pages.HomePage;
import org.example.Pages.MouseOverPage;
import org.example.Pages.TextInputPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    protected Properties runProperties;

    protected HomePage homePage = new HomePage(getWebDriver(), getActions());
    protected MouseOverPage mouseOverPage = new MouseOverPage(getWebDriver(), getActions());
    protected AlertsPage alertsPage = new AlertsPage(getWebDriver(), getActions());
    protected TextInputPage textInputPage = new TextInputPage(getWebDriver(), getActions());

    private static WebDriver driver;
    private static Actions actions;

    @BeforeClass
    public void openBasePage(){
        driver.get(runProperties.getProperty("baseUrl"));
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

    public static WebDriver getWebDriver(){
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            return driver;
        } else {
            return driver;
        }
    }


    public static Actions getActions(){
        if (actions == null) {
            return new Actions(getWebDriver());
        } else {
            return actions;
        }
    }

    @BeforeSuite
    public void setProperties() throws IOException {
        runProperties  = new Properties();
        FileInputStream fis = new FileInputStream("src/main/resources/properties.properties");
        runProperties.load(fis);
        fis.close();
    }
}
