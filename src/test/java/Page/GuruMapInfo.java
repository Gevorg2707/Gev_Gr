package Page;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class GuruMapInfo {
    WebDriver driver;
    BasePage basePage;

    public GuruMapInfo(WebDriver driver) {
        this.driver = driver;
    }

    public Map<String, String> mapInfo () {
        basePage = new BasePage(driver);
        Map<String, String> mapinfo = new HashMap<>();
        String login = basePage.getElement("xpath", "//tr[4]/td[2]").getText();
        String parol = basePage.getElement("xpath", "//tr[5]/td[2]").getText();
        mapinfo.put("login", login);
        mapinfo.put("parol", parol);
       //  System.out.println(mapinfo.get("login"));
     //    System.out.println(mapinfo.put("parol",parol));
        return mapinfo;
    }
}
