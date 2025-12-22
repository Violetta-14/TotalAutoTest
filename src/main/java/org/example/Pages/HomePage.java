package org.example.Pages;

import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.$x;


public class HomePage extends BasePage{

    private static final String LINK_LOCATOR_PATTERN = "//h3/a[text()='%s']";

    @Step("Переход на страницу {sectionName}")
    public void redirectToSection(String sectionName){
       $x(String.format(LINK_LOCATOR_PATTERN, sectionName)).click();
//        driver.findElement(By.xpath(LINK_LOCATOR_PATTERN.formatted(sectionName)));
    }
}
