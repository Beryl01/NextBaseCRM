package com.cheatSheat.tests;

import com.cheatSheat.pages.NextBaseEventPage;
import com.cheatSheat.pages.NextBaseLogin;
import com.cheatSheat.utility.BrowserUtil;
import com.cheatSheat.utility.ConfigReader;
import com.cheatSheat.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

public class NextBaseCreateSchedule extends TestBase {
    @Test
    public void createSchedule(){
        NextBaseLogin nextBaseLogin = new NextBaseLogin();
        NextBaseEventPage nextBaseEventPage = new NextBaseEventPage();

        String username = ConfigReader.read("username");
        String password = ConfigReader.read("password");

        nextBaseEventPage.goTo();
        nextBaseLogin.login(username, password);

        nextBaseEventPage.event();

        BrowserUtil.waitFor(2);
        nextBaseEventPage.setNameBody();





    }

}
