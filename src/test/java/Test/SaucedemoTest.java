package Test;

import Base.SeleniumBase;
import Page.BasePage;
import Page.Guru99TestHomePage;
import Page.GuruMapInfo;
import Page.SaucedemoPage;
import Utils.Helpers;
import org.openqa.selenium.devtools.v85.dom.model.BackendNode;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SaucedemoTest extends SeleniumBase {

    BasePage basePage;
    SaucedemoPage saucedemoPage;
    Helpers helpers;
    GuruMapInfo guruMapInfo;

    @BeforeTest
    public void intDriver() {
        initDriver();
    }

    @Test
    public void saucerTest1() throws InterruptedException {
        saucedemoPage=new SaucedemoPage(driver);
//        guruMapInfo=new GuruMapInfo(driver);
//        helpers = new Helpers();
        saucedemoPage.geturlS();
//        guruMapInfo.mapInfoSaucedemo();
//        saucedemoPage.logigPage();
//        String logintext=basePage.getElement("css","login_credentials").getText();
//        System.out.println("logintext = " + logintext);
    }

}
