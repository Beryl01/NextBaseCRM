package com.cheatSheat.tests;

import com.cheatSheat.pages.NextBaseCreatePollFunction;
import com.cheatSheat.pages.NextBaseLogin;
import com.cheatSheat.pages.NextBaseUploadFile;
import com.cheatSheat.utility.BrowserUtil;
import com.cheatSheat.utility.ConfigReader;
import com.cheatSheat.utility.TestBase;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class NextBaseUploadFileTest extends TestBase {

    @Test
    public void testFileUpload() {
        NextBaseLogin nextBaseLogin = new NextBaseLogin();
        NextBaseUploadFile uploadFile = new NextBaseUploadFile();

        String username = ConfigReader.read("username");
        String password = ConfigReader.read("password");

        uploadFile.goTo();
        nextBaseLogin.login(username,password);


        uploadFile.moreButton();
        BrowserUtil.waitFor(2);

        assertEquals("File",uploadFile.fileOption.getText());

        uploadFile.fileButton();
        BrowserUtil.waitFor(1);

        assertTrue(uploadFile.imageUploadText.isDisplayed());



       /*
        Actions hoverUpload = new Actions(driver);
        hoverUpload.moveToElement(uploadFile.FileUploadButton).perform();
        BrowserUtil.waitFor(1);
        hoverUpload.click();
        */
        BrowserUtil.waitFor(1);
        uploadFile.selectFromBitrix24();
        BrowserUtil.waitFor(2);


    }
}
