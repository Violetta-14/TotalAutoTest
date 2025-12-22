package org.example.Pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;


public class MouseOverPage extends BasePage{

    private SelenideElement clickMeButton = $x("//div/a[text()='Click me']"); //@class='text-primary' and text()='Click me'
    private SelenideElement clickMeButtonCounter = $x("//span[@id='clickCount']");

    @Step("Навести на кнопку Click Me")
    public void hoverClickMeButton(){
        clickMeButton.hover();
    }

    @Step("Проверить сколько кликов было совершено по кнопке")
    public String getClickCount(){
        return clickMeButtonCounter.getText();
    }

    @Step("Кликнуть дважды на кнопку")
    public void doubleClick(int clickCount){
        for (int i = 0; i < clickCount; i++){
            clickMeButton.doubleClick();
        }
    }

    @Step("Получить значение атрибута кнопки Click Me")
    public String getClickMeAttribute(String attributeName){
        return clickMeButton.getAttribute(attributeName);
    }
}
