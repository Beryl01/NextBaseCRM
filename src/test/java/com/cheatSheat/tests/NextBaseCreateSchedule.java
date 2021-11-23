package com.cheatSheat.tests;

import com.cheatSheat.pages.NextBaseEventPage;
import com.cheatSheat.pages.NextBaseLogin;
import com.cheatSheat.utility.BrowserUtil;
import com.cheatSheat.utility.ConfigReader;
import com.cheatSheat.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static org.junit.jupiter.api.Assertions.*;

public class NextBaseCreateSchedule extends TestBase {
    @Test
    public void createSchedule(){
        NextBaseLogin nextBaseLogin = new NextBaseLogin();
        NextBaseEventPage nextBaseEventPage = new NextBaseEventPage();

        String username = ConfigReader.read("username");
        String password = ConfigReader.read("password");

        nextBaseEventPage.goTo();
        nextBaseLogin.login(username, password);

        BrowserUtil.waitFor(2);
        nextBaseEventPage.event();

        BrowserUtil.waitFor(2);
        assertTrue(nextBaseEventPage.eventName.isDisplayed());
        BrowserUtil.waitFor(1);
        nextBaseEventPage.allDay.click();

        assertFalse(nextBaseEventPage.eventStart.isDisplayed());

        BrowserUtil.waitFor(2);

        nextBaseEventPage.setReminder.click();
        BrowserUtil.waitFor(2);

        assertFalse(nextBaseEventPage.defaultReminderTime.isDisplayed());

        nextBaseEventPage.setNameBody();


    }

}
