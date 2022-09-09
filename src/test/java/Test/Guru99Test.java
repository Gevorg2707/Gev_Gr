package Test;

import Base.SeleniumBase;
import Page.BasePage;
import Page.Guru99TestHomePage;
import Page.GuruMapInfo;
import Utils.Helpers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Guru99Test extends SeleniumBase {
    BasePage basePage;
    Guru99TestHomePage guru99TestHomePage;
    GuruMapInfo guruMapInfo;
    Helpers helpers;
    String userpass;

    @Test
    public void GuruTets1() throws InterruptedException {
        guru99TestHomePage=new Guru99TestHomePage(driver);
        guruMapInfo=new GuruMapInfo(driver);
        helpers = new Helpers();
        userpass = helpers.randomStr2(8);
        guru99TestHomePage.registrationGuru(userpass);
        guruMapInfo.mapInfo();
        guru99TestHomePage.bankTets();

    }
}


