package com.cheatSheat.pages;

import com.cheatSheat.utility.ConfigReader;
import com.cheatSheat.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;

public class NextBaseEventPage {

    @FindBy(xpath = "(//span[.='Event'])[2]")
    public WebElement eventButton;

    @FindBy(id = "feed-cal-event-namecal_3Jcl")
    public WebElement eventName;

    public void nextBaseEvents(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void goTo(){
        Driver.getDriver().navigate().to(ConfigReader.read("url"));
    }

    // navigate to events page
    public void event() {
        this.eventButton.click();
    }
    //input event name
    public void setNameBody(){
        eventName.sendKeys("Graduation Day " + Keys.ENTER);
    }



}
