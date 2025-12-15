package org.example.Pages;

import com.codeborne.selenide.SelenideElement;
import java.io.File;
import static com.codeborne.selenide.Selenide.$x;

public class FileUploadPage extends BasePage{

    SelenideElement uploadFileInput = $x("//input[@id='browse']");

    public void uploadFile(File file){
        uploadFileInput.uploadFile(file);
    }
}
