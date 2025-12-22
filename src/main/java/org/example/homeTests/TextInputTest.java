package org.example.homeTests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TextInputTest extends BaseTest {

    Logger loggerTextInput = LogManager.getLogger(TextInputTest.class);

    @Test
    @Description("Проверка отработки Input запросов")
    @Epic("INPUTTEST")
    public void testInputText(){

        homePage.redirectToSection("Text Input");

        loggerTextInput.info("test page is Text Input");

        textInputPage.writeInputText("Hello");
        System.out.println("Text 1 in line");

        textInputPage.clickUpdatingButton();
        System.out.println("Text 1 in button");

        String lineTest = textInputPage.getTextFromLine();
        String buttonText = textInputPage.getTextFromButton();

        Assert.assertTrue(buttonText.contains(lineTest));
        System.out.println("Текущий текст кнопки: " + buttonText);
        textInputPage.clearInputText();


        textInputPage.writeInputText("NEW name button");
        System.out.println("Text 2 in line");

        textInputPage.clickUpdatingButton();
        System.out.println("Text 2 in button");

        String lineTest2 = textInputPage.getTextFromLine();
        String buttonText2 = textInputPage.getTextFromButton();

        Assert.assertTrue(buttonText2.contains(lineTest2));
        System.out.println("Текущий текст кнопки: " + buttonText2);
        textInputPage.clearInputText();


        textInputPage.writeInputText("END");
        System.out.println("Text 3 in line");

        textInputPage.clickUpdatingButton();
        System.out.println("Text 3 in button");

        String lineTest3 = textInputPage.getTextFromLine();
        String buttonText3 = textInputPage.getTextFromButton();

        Assert.assertTrue(buttonText3.contains(lineTest3));
        System.out.println("Текущий текст кнопки: " + buttonText3);
    }
}
