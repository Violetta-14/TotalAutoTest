package org.example.Pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.io.File;
import static com.codeborne.selenide.Selenide.$x;


public class FileUploadPage extends BasePage{

    private SelenideElement uploadFileInput = $x("//input[@id='browse']");

    @Step("Загрузить файл на страницу сайта")
    public void uploadFile(File file){
        uploadFileInput.uploadFile(file);
    }
}
