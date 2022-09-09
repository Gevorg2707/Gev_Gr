package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Personalinformation {
    WebDriver driver;
    BasePage basePage;

    public Personalinformation(WebDriver driver) {
        this.driver = driver;
    }
    public void personalInformation() throws InterruptedException {

        basePage=new BasePage(driver);
        basePage.delay(5);
        basePage.clickOnElement("id","id_gender1");
//        driver.findElement(By.id("id_gender1")).click();
        basePage.insertInto("id","customer_firstname","Gevorg");
//        driver.findElement(By.id("customer_firstname")).clear();
//        driver.findElement(By.id("customer_firstname")).sendKeys("Gevorg");
        basePage.insertInto("id","customer_lastname","Grigoryan");
//        driver.findElement(By.id("customer_lastname")).clear();
//        driver.findElement(By.id("customer_lastname")).sendKeys("Grigoryan");
        basePage.insertInto("id","passwd","GG1111");
//        driver.findElement(By.id("passwd")).clear();
//        driver.findElement(By.id("passwd")).sendKeys("GG1111");

        WebElement selectDays=driver.findElement(By.id("days"));
        Select selectDaysObyect=new Select(selectDays);
        selectDaysObyect.selectByIndex(2);
        WebElement selectMonths=driver.findElement(By.id("months"));
        Select selectMonthsObyect=new Select(selectMonths);
        selectMonthsObyect.selectByIndex(3);
        WebElement selectYears=driver.findElement(By.id("years"));
        Select selectYearsObyect=new Select(selectYears);
        selectYearsObyect.selectByIndex(4);


        basePage.insertInto("id","address1","Hamilton aven., 17-4");
//        driver.findElement(By.id("address1")).clear();
//        driver.findElement(By.id("address1")).sendKeys("Hamilton aven., 17-4");

        basePage.insertInto("id","city","San Francisco");
//        driver.findElement(By.id("city")).clear();
//        driver.findElement(By.id("city")).sendKeys("San Francisco");



        WebElement selectState=driver.findElement(By.id("id_state"));
        Select selectStateObyect=new Select(selectState);
        selectStateObyect.selectByIndex(4);


        basePage.insertInto("id","postcode","06000");
//        driver.findElement(By.id("postcode")).clear();
//        driver.findElement(By.id("postcode")).sendKeys("060");


        WebElement selectCountry=driver.findElement(By.id("id_country"));
        Select selectCountryObyect=new Select(selectCountry);
        selectCountryObyect.selectByIndex(1);


        basePage.insertInto("id","phone_mobile","+354505050054");
//        driver.findElement(By.id("phone_mobile")).clear();
//        driver.findElement(By.id("phone_mobile")).sendKeys("+354505050054");


        basePage.insertInto("id","alias","Adam Smith Av., 7-14");
//        driver.findElement(By.id("alias")).clear();
//        driver.findElement(By.id("alias")).sendKeys("Adam Smith Av., 7-14");

        basePage.clickOnElement("css","button[id='submitAccount'] span");
//        driver.findElement(By.cssSelector("button[id='submitAccount'] span")).click();


//        basePage.delay(5);
//        Thread.sleep(500);
    }
}