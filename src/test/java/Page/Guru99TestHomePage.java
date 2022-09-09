package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;
import java.util.Map;

public class Guru99TestHomePage {
    WebDriver driver;
    BasePage basePage;


    public Guru99TestHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void registrationGuru(String userpass) throws InterruptedException {
        basePage = new BasePage(driver);
        basePage.getUrl("https://demo.guru99.com/");
        basePage.delay(1);
        basePage.insertInto("css", "input[name='emailid']", userpass + "@mail.ru");
        basePage.clickOnElement("css", "input[value='Submit']");
    }
//    public Map<String, String> mapInfo (){
//        Map<String,String>info=new HashMap<>();
//        String login=basePage.getElement("xpath","//tr[4]/td[2]").getText();
//        String parol=basePage.getElement("xpath","//tr[5]/td[2]").getText();
//        info.put("login",login);
//        info.put("parol",parol);
//       // System.out.println(info.get("login"));
//      //  System.out.println(info.put("parol",parol));
//        return info;
    public void bankTets() throws InterruptedException {
        basePage=new BasePage(driver);
        GuruMapInfo guruMapInfo=new GuruMapInfo(driver);
        String login=(String) guruMapInfo.mapInfo().get("login");
        String parol=(String) guruMapInfo.mapInfo().get("parol");
        basePage.clickOnElement("css","a[href='http://demo.guru99.com/V1/index.php']");
        basePage.insertInto("css","[name='uid']",login);
      //  System.out.println(guruMapInfo.mapInfo().get("login"));
      //  String parol=(String) guruMapInfo.mapInfo().get("parol");
        basePage.insertInto("css","[name='password']",parol);
       // System.out.println(guruMapInfo.mapInfo().get("parol"));
        basePage.clickOnElement("css","input[value='LOGIN']");
        basePage.delay(5);
//        basePage.clickOnElement("css","a[href='addAccount.php']");
        //<a href="addAccount.php">New Account</a>
        String txt=basePage.getElement("css","a[href='addAccount.php']").getText();
        System.out.println("txt = " + txt);
        basePage.clickOnElement("css","a[href='Managerhomepage.php']");
//        basePage.clickOnElement("css","a[href='addAccount.php']");
//        basePage.clickOnElement("xpath","//a[normalize-space()='New Account']");
//        basePage.clickOnElement("css","a[href='addcustomerpage.php']");
        driver.findElement(By.linkText("New Customer")).click();
        basePage.clickOnElement("css","input[type='text']");
        basePage.insertInto("css","input[type='text']","Ani");
//        basePage.clickOnElement("css","input[value='f']");
        basePage.insertInto("css","textarea[name='addr']","4-th av.,jhjghjghg");
        basePage.insertInto("id","dob","02021991");
        basePage.insertInto("css","input[name='city']","Glendel");
        basePage.insertInto("css","input[name='state']","California");
        basePage.insertInto("css","input[name='pinno']","121212");
        basePage.insertInto("css","input[name='telephoneno']","+37498458484");
        basePage.insertInto("css", "input[name='emailid']", "Gevggfgfgf@mail.ru");
        //input[name='emailid']
        basePage.insertInto("css", "input[name='password']", "GG1598");
        //input[name='password']
        basePage.clickOnElement("css","input[value='Submit']");
        //input[value='Submit']
    }
}

