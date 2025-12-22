package org.example.Pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;


public class SampleAppPage extends BasePage{

    private SelenideElement buttonLogIn = $x("//button[@id='login']");
    private SelenideElement userNameLine = $x("//div/input[@placeholder='User Name']");
    private SelenideElement passwordLine = $x("//div/input[@type='password']");
    private SelenideElement checkLine = $x("//div/label[@id='loginstatus']");

    @Step("Вписать текст в строку User Name")
    public void fillUserName(String text){
        userNameLine.sendKeys(text);
    }

    @Step("Вписать текст в строку Password")
    public void fillPassword(String text){
        passwordLine.sendKeys(text);
    }

    @Step("Кликнуть на кнопку Log in")
    public void clickLogInButton(){
        buttonLogIn.click();
    }

    @Step("Считать текст со строки проверки")
    public String getTextFromCheckLine(){
        return checkLine.getText();
    }
}
