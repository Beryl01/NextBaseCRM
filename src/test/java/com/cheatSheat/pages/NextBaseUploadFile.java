package com.cheatSheat.pages;

import com.cheatSheat.utility.ConfigReader;
import com.cheatSheat.utility.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class NextBaseUploadFile {
    @FindBy(xpath ="//span[@id=\"feed-add-post-form-link-text\"]")
    public WebElement moreSelect;

    @FindBy(xpath = "//span[@class=\"menu-popup-item-text\"]")
    public WebElement fileOption;

    @FindBy(xpath = "//span[@class=\"wd-fa-add-file-light-title-text\"]")
    public WebElement imageUploadText;
    @FindBy(xpath = "//span[@class=\"wd-fa-add-file-light\"]")
    public WebElement fileUploadButton;
    @FindBy(xpath = "(//td[@class=\"wd-fa-add-file-light-cell\"]/span/span/span/span)[1]")
    public WebElement bitrix24;



    public NextBaseUploadFile(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void goTo(){
        Driver.getDriver().navigate().to(ConfigReader.read("url"));
    }

    public void moreButton(){
        moreSelect.click();
    }
    public void fileButton(){
        fileOption.click();
    }
    public void selectFromBitrix24(){
        bitrix24.click();
    }


}
