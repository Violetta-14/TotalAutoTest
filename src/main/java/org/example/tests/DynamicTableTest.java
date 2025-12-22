package org.example.tests;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DynamicTableTest extends BaseTest{

    Logger loggerDynamicTable = LogManager.getLogger(DynamicTableTest.class);

    @Test
    @Description("Проверка отработки Dynamic Table запросов")
    @Epic("DYNAMICTABLETEST")
    public void tableTest(){

        homePage.redirectToSection("Dynamic Table");

        loggerDynamicTable.info("test page is Dynamic Table");

        String expectedValue = dynamicTablePage.getCpuValue();
        ElementsCollection actualHeaders = dynamicTablePage.getHeader();

        int cpuIndext = 0;

        for (int i = 0; i < actualHeaders.size(); i++){
            String header = actualHeaders.get(i).getText();
            if (header.equals("CPU")){
                cpuIndext = i;
                break;
            }
        }

        String tableValue = dynamicTablePage.getChromeRow()
                .findElements(By.xpath("./span"))
                .get(cpuIndext)
                .getText();

        Assert.assertTrue(expectedValue.contains(tableValue),
                "Ожидаемое значение '" + expectedValue + "' не найдено в тексте таблицы: " + tableValue);
        }
}
