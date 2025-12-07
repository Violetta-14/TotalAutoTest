package org.example.homeTests;

import org.example.tests.BaseTest;
import org.testng.annotations.Test;

public class TextInputTest extends BaseTest {

    @Test
    public void testInputText(){

        homePage.redirectToSection("Text Input");

        textInputPage.writeInputText("Hello");
        System.out.println("Text 1 in line");

        textInputPage.clickUpdatingButton();
        System.out.println("Text 1 in button");

        textInputPage.clearInputText();

        textInputPage.writeInputText("NEW name button");
        System.out.println("Text 2 in line");

        textInputPage.clickUpdatingButton();
        System.out.println("Text 2 in button");

        textInputPage.clearInputText();

        textInputPage.writeInputText("END");
        System.out.println("Text 3 in line");

        textInputPage.clickUpdatingButton();
        System.out.println("Text 3 in button");
    }
}
