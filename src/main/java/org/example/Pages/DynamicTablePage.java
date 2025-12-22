package org.example.Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;


public class DynamicTablePage extends BasePage{

    private SelenideElement cpuValue = $x("//p[@class='bg-warning']");
    private ElementsCollection columnHeaders = $$x("//span[@role='columnheader']");
    private SelenideElement chromeRow = $x("//span[text()='Chrome']/..");

    @Step("Получить итоговое значение CPU")
    public String getCpuValue(){
        return cpuValue.getText();
    }

    @Step("Найти столбец где хранится значение CPU")
    public ElementsCollection getHeader(){
        return columnHeaders;
    }

    @Step("Получить значение CPU для строки Chrome")
    public SelenideElement getChromeRow(){
        return chromeRow;
    }
}
