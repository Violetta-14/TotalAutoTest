package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class TextInputPage extends BasePage{

    By inputTextOfButton = By.xpath("//input[@id='newButtonName']");
    By updatingButton = By.xpath("//button[@id='updatingButton']");

    public void writeInputText(String text){
        driver.findElement(inputTextOfButton).sendKeys(text);
    }

    public void clearInputText(){
        driver.findElement(inputTextOfButton).clear();
    }

    public void clickUpdatingButton(){
        driver.findElement(updatingButton).click();
    }

    public TextInputPage(WebDriver driver, Actions actions){
        super(driver, actions);
    }
}
