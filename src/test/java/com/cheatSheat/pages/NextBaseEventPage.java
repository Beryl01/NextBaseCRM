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

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-calendar']")
    public WebElement eventButton;

    @FindBy(xpath = "//input[@id = \"feed-cal-event-namecal_3Jcl\"]")
    public WebElement eventName;

    @FindBy(xpath = "//input[@id=\"event-full-daycal_3Jcl\"]")
    public WebElement allDay;

    @FindBy(xpath = "(//label[@class=\"feed-event-date-label\"])[1]")
    public WebElement eventStart;

    @FindBy(xpath = "//input[@id=\"event-remindercal_3Jcl\"]")
    public WebElement setReminder;

    @FindBy(xpath = "//select[@id=\"event-remind_typecal_3Jcl\"]")
    public WebElement defaultReminderTime;

    public NextBaseEventPage(){
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
        eventName.sendKeys("Graduation Day ");
    }

/*    public void setAllDay(){
        allDay.click();
        allDay.isSelected();
    }*/






}
