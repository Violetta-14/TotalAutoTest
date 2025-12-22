package org.example.tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.example.Pages.*;
import org.example.listeners.TestListener;
import org.openqa.selenium.OutputType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


@Listeners(TestListener.class)
public class BaseTest {

    protected Properties runProperties;

    protected HomePage homePage = new HomePage();
    protected MouseOverPage mouseOverPage = new MouseOverPage();
    protected AlertsPage alertsPage = new AlertsPage();
    protected TextInputPage textInputPage = new TextInputPage();
    protected FileUploadPage fileUploadPage = new FileUploadPage();
    protected DynamicTablePage dynamicTablePage = new DynamicTablePage();
    protected AJAXDataPage ajaxDataPage = new AJAXDataPage();
    protected SampleAppPage sampleAppPage = new SampleAppPage();

//    private static WebDriver driver;
//    private static Actions actions;
//
    @BeforeClass
    @Step("Открыть базовую страницу")
    public void openBasePage(){
        try {
            setProperties();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Configuration.timeout = 20000;

        Selenide.open(runProperties.getProperty("baseUrl"));
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    public static void getScreenshot(){
        byte[] bytes = Selenide.screenshot(OutputType.BYTES);
        if (bytes != null){
            Allure.addAttachment("Screen", "image/png", new ByteArrayInputStream(bytes), ".png");
        } else {
            System.out.println("не удалось сделать скрин");
        }
    }

//    @AfterSuite(alwaysRun = true)
//    public void closeBrowser(){
//        Selenide.closeWebDriver();
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
//    public static Actions getActions(){
//        if (actions == null) {
//            return new Actions(getWebDriver());
//        } else {
//            return actions;
//        }
//    }
//
//    public static WebDriver getWebDriver(){
//        return WebDriverRunner.getWebDriver();
//    }
    
    private void setProperties() throws IOException {
        runProperties  = new Properties();
        FileInputStream fis = new FileInputStream("src/main/resources/properties.properties");
        runProperties.load(fis);
        fis.close();
    }

//    public void switchToLastOpenTab(){
//        WebDriver driver = null;
//        List<String> handles = driver.getWindowHandles().stream().toList();
//        driver.switchTo().window(handles.get(handles.size() - 1));
//    }
}
