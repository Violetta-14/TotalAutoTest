package org.example.tests;


import org.example.Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class BaseTest {

    protected Properties runProperties;

    protected HomePage homePage = new HomePage();
    protected MouseOverPage mouseOverPage = new MouseOverPage();
    protected AlertsPage alertsPage = new AlertsPage();
    protected TextInputPage textInputPage = new TextInputPage();
    protected FileUploadPage fileUploadPage = new FileUploadPage();
    protected DynamicTablePage dynamicTablePage = new DynamicTablePage();

//    private static WebDriver driver;
//    private static Actions actions;
//
//    @BeforeClass
//    public void openBasePage(){
//        try {
//            setProperties();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        driver.get(runProperties.getProperty("baseUrl"));
//    }
//
//    @AfterSuite(alwaysRun = true)
//    public void closeBrowser(){
//        driver.quit();
//
//    }
//
//    public static WebDriver getWebDriver(){
//        if (driver == null) {
//            WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver();
//            driver.manage().window().maximize();
//            return driver;
//        } else {
//            return driver;
//        }
//    }
//
//
//    public static Actions getActions(){
//        if (actions == null) {
//            return new Actions(getWebDriver());
//        } else {
//            return actions;
//        }
//    }
//
//    private void setProperties() throws IOException {
//        runProperties  = new Properties();
//        FileInputStream fis = new FileInputStream("src/main/resources/properties.properties");
//        runProperties.load(fis);
//        fis.close();
//    }
//
//    public void switchToLastOpenTab(){
//        List<String> handles = driver.getWindowHandles().stream().toList();
//        driver.switchTo().window(handles.get(handles.size() - 1));
//    }
}
