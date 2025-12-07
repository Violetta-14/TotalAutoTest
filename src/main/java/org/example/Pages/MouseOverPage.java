package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverPage extends BasePage{

    private By clickMeButton = By.xpath("//div/a[@class='text-primary' and text()='Click me']");
    private By clickMeButtonCounter = By.xpath("//span[@id='clickCount']");

    public void hoverClickMeButton(){
        actions.moveToElement(driver.findElement(clickMeButton)).perform(); //perform чтоб цепочка действий воспроизвелась
        //если что-то зажато нужно написать relise, или как-то так чтоб отжало кнопку
    }

    public String getClickCount(){
        return driver.findElement(clickMeButtonCounter).getText();
    }

    public void doubleClick(int clickCount){
        for (int i = 0; i < clickCount; i++){
            actions.doubleClick(driver.findElement(clickMeButton)).perform();
        }
    }

    public String getClickMeAttribute(String attributeName){
        return driver.findElement(clickMeButton).getAttribute(attributeName);
    }

    public MouseOverPage(WebDriver driver, Actions actions){
        super(driver, actions);
    }
}
