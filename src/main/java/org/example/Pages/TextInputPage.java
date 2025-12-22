package org.example.Pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class TextInputPage extends BasePage{

    private SelenideElement inputTextOfButton = $x("//input[@id='newButtonName']");
    private SelenideElement updatingButton = $x("//button[@id='updatingButton']");

    @Step("Вписать текст в строку")
    public void writeInputText(String text){
        inputTextOfButton.sendKeys(text);
    }

    @Step("Отчистить строку")
    public void clearInputText(){
        inputTextOfButton.clear();
    }

    @Step("Кликнуть на кнопку обновления строки")
    public void clickUpdatingButton(){
        updatingButton.click();
    }

    @Step("Считать текст со строки")
    public String getTextFromLine(){
        return inputTextOfButton.getText();
    }

    @Step("Считать текст с кнопки")
    public String getTextFromButton(){
        return updatingButton.getText();
    }
}
