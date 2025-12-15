package org.example.Pages;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class DynamicTablePage extends BasePage{

    SelenideElement cpuValue = $x("//p[@class='bg-warning']");
    ElementsCollection columnHeaders = $$x("//span[@role='columnheader']");
    SelenideElement chromeRow = $x("//span[text()='Chrome']/..");

    public String getCpuValue(){
        return cpuValue.getText();
    }

    public ElementsCollection getHeader(){
        return columnHeaders;
    }

    public SelenideElement getChromeRow(){
        return chromeRow;
    }
}
