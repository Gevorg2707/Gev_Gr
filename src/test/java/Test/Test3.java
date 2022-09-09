package Test;

import Base.SeleniumBase;
import Page.*;
import Utils.Helpers;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 extends SeleniumBase {

    BasePage basePage;
    Personalinformation personalinformation;
    Helpers helpers;
    String userpass;
    AutomationpracticeHomePage automationpracticeHomePage;
    Guru99TestHomePage guru99TestHomePage;
    GuruMapInfo guruMapInfo;

    @BeforeTest
    public void intDriver() {
        initDriver();
    }

    @Test
    public void getUrl() throws InterruptedException {
        automationpracticeHomePage = new AutomationpracticeHomePage(driver);
        helpers = new Helpers();
        userpass = helpers.randomStr2(8);
        automationpracticeHomePage.registration(userpass);
    }

    @Test(priority = 1)
    public void perIn() throws InterruptedException {
        personalinformation = new Personalinformation(driver);
        personalinformation.personalInformation();
    }

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









