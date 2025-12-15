package org.example.tests;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;



public class DynamicTableTest extends BaseTest{

    @Test
    public void tableTest(){
        homePage.redirectToSection("Dynamic Table");

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

        Assert.assertEquals(expectedValue, tableValue);

    }
}
