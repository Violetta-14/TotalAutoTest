package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class AlertsPage extends BasePage{

    By promptButton = By.xpath("//button[@id='promptButton']");
    By confirmButton = By.xpath("//button[@id='confirmButton']");

    public void clickConfirmButton(){
        driver.findElement(confirmButton).click();
    }

    public static boolean checkFriday() {
        return java.time.LocalDate.now().getDayOfWeek() == DayOfWeek.FRIDAY;

        //LocalDate today = LocalDate.now(); //получаем текущую дату
        //DayOfWeek dayOfWeek = today.getDayOfWeek(); //получаем день недели
    }

    public void clickPromptButton(){
        driver.findElement(promptButton).click();
    }

    //для кнопки подтверждения (ок, принять и т.д)
    public void confirmAlert(){
        driver.switchTo().alert().accept(); //перейти-на алерт-принять
    }

    //для пнопки отмены (отмена, назад и т.д)
    public void dismissAlert(){
        driver.switchTo().alert().dismiss(); //перейти-на алерт-отменить
    }

    //получить текст с алерта
    public String getTextFromAlert(){
       return driver.switchTo().alert().getText();
    }

    //отпрвить текст в алерт
    public void setTextToAlert(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public AlertsPage(WebDriver driver, Actions actions){
        super(driver, actions);
    }
}
