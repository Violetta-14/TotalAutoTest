package org.example.Pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class TextInputPage extends BasePage{

    SelenideElement inputTextOfButton = $x("//input[@id='newButtonName']");
    SelenideElement updatingButton = $x("//button[@id='updatingButton']");

    public void writeInputText(String text){
        inputTextOfButton.sendKeys(text);
    }

    public void clearInputText(){
        inputTextOfButton.clear();
    }

    public void clickUpdatingButton(){
        updatingButton.click();
    }
}
