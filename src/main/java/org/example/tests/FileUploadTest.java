package org.example.tests;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import java.io.File;


public class FileUploadTest extends BaseTest{

    Logger loggerFileUpload = LogManager.getLogger(FileUploadTest.class);

    @Test
    @Description("Проверка отработки File Upload запросов")
    @Epic("FILEUPLOADTEST")
    public void uploadTest(){

        homePage.redirectToSection("File Upload");

        loggerFileUpload.info("test page is File Upload");

        Selenide.switchTo().frame(0);

        File file = new File("src/main/resources/FileToUpload.txt");
        fileUploadPage.uploadFile(file);
        File file2 = new File("src/main/resources/FileToUpload2.txt");
        fileUploadPage.uploadFile(file2);

        Selenide.switchTo().defaultContent();
        System.out.println("test");
    }
}
