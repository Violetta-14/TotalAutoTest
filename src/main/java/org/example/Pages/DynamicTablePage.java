package org.example.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DynamicTablePage extends BasePage{

    By cpuValue = By.xpath("//p[@class='bg-warning']");
    By columnHeaders = By.xpath("//span[@role='columnheader']");
    By chromeRow = By.xpath("//span[text()='Chrome']/..");

    public String getCpuValue(){
        return driver.findElement(cpuValue).getText();
    }

    public List<WebElement> getHeader(){
        return driver.findElements(columnHeaders);
    }

    public WebElement getChromeRow(){
        return driver.findElement(chromeRow);
    }

    public DynamicTablePage(WebDriver driver, Actions actions){
        super(driver, actions);
    }
}
