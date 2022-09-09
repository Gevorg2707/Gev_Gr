package Page;

import org.openqa.selenium.WebDriver;

public class SaucedemoPage {
    WebDriver driver;
    BasePage basePage;

    public SaucedemoPage(WebDriver driver) {
        this.driver = driver;
    }
    public void geturlS() throws InterruptedException {
        basePage = new BasePage(driver);
        basePage.delay(1);
        basePage.getUrl("https://www.saucedemo.com/");
        String logintext=basePage.getElement("css","login_credentials").getText();
        System.out.println("logintext = " + logintext);
    }
    public void logigPage() throws InterruptedException {
//        GuruMapInfo guruMapInfo=new GuruMapInfo(driver);
//        String login=(String) guruMapInfo.mapInfoSaucedemo().get("logins");
//        String parol=(String) guruMapInfo.mapInfoSaucedemo().get("parols");
        String logintext=basePage.getElement("css","login_credentials").getText();
        System.out.println("logintext = " + logintext);
//        basePage.insertInto("css","#user-name",login);
//        basePage.insertInto("css","#password",parol);
//        basePage.delay(1);
//        basePage.clickOnElement("css","#login-button");

    }
}
