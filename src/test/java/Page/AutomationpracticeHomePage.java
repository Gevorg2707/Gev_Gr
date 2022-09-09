package Page;

import org.openqa.selenium.WebDriver;

public class AutomationpracticeHomePage {

    WebDriver driver;
    BasePage basePage;

    public  AutomationpracticeHomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void registration(String userpass) throws InterruptedException {
        basePage=new BasePage(driver);
        basePage.getUrl("http://automationpractice.com/index.php");
        basePage.delay(1);
        basePage.clickOnElement("css","a[rel=\"nofollow\"]");
        basePage.delay(3);
        basePage.insertInto("css", "input[data-validate=isEmail]", userpass+"@mail.ru" );
        basePage.clickOnElement("css", "i.icon-user.left");

//        basePage.clickOnElement("css","a[rel=\"nofollow\"]");
    }
}
