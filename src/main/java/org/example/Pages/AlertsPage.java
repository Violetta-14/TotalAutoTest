package org.example.Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import java.time.DayOfWeek;
import static com.codeborne.selenide.Selenide.$x;


public class AlertsPage extends BasePage{

    SelenideElement promptButton = $x("//button[@id='promptButton']");
    SelenideElement confirmButton = $x("//button[@id='confirmButton']");

    public void clickConfirmButton(){
        confirmButton.click();
    }

    public static boolean checkFriday() {
        return java.time.LocalDate.now().getDayOfWeek() == DayOfWeek.FRIDAY;

        //LocalDate today = LocalDate.now(); //получаем текущую дату
        //DayOfWeek dayOfWeek = today.getDayOfWeek(); //получаем день недели
    }

    public void clickPromptButton(){
        promptButton.click();
    }

    //для кнопки подтверждения (ок, принять и т.д)
    public void confirmAlert(){
        Selenide.switchTo().alert().accept();
        //перейти-на алерт-принять
    }

    //для пнопки отмены (отмена, назад и т.д)
    public void dismissAlert(){
        Selenide.switchTo().alert().dismiss(); //перейти-на алерт-отменить
    }

    //получить текст с алерта
    public String getTextFromAlert(){
       return Selenide.switchTo().alert().getText();
    }

    //отпрвить текст в алерт
    public void setTextToAlert(String text){
        Selenide.switchTo().alert().sendKeys(text);
    }
}
