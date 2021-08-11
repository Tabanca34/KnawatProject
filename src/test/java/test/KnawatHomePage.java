package test;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Page01;
import utilities.Driver;




    public class KnawatHomePage {


        @Test
        public void test() throws InterruptedException {
            Page01 page = new Page01();
            Driver.getDriver().get("http://automationpractice.com/index.php");

            page.singButonu.click();
            page.email.sendKeys("a.karaman@gmail.com");
            page.createButtonu.click();

            Thread.sleep(2000);
            page.titleButonu.click();
            Actions actions = new Actions(Driver.getDriver());
            actions.click(page.firstName).sendKeys("mehmet").sendKeys(Keys.TAB).
                    sendKeys("karaman").sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                    sendKeys("12345").sendKeys(Keys.TAB).
                    sendKeys("1").sendKeys(Keys.TAB).
                    sendKeys("january").sendKeys(Keys.TAB).
                    sendKeys("1990").perform();

            Thread.sleep(2000);
            page.addressNameBox.clear();
            page.addressNameBox.click();
            Actions actions1 = new Actions(Driver.getDriver());
            page.addressLastNameBox.clear();
            actions1.click(page.addressNameBox).sendKeys("selcuk").sendKeys(Keys.TAB).
                    sendKeys("tabanca").sendKeys(Keys.TAB).
                    sendKeys("knawat").sendKeys(Keys.TAB).
                    sendKeys("acıbadem Uskudar").sendKeys(Keys.TAB).
                    sendKeys("cakmak apartman").sendKeys(Keys.TAB).
                    sendKeys("Istanbul").sendKeys(Keys.TAB).
                    sendKeys("Istanbul").sendKeys(Keys.TAB).
                    sendKeys("34600").sendKeys(Keys.TAB).
                    sendKeys("Unıted States").sendKeys(Keys.TAB).
                    sendKeys("02124134544").sendKeys(Keys.TAB).
                    sendKeys("02124134545").sendKeys(Keys.TAB).
                    sendKeys("05334454545").sendKeys(Keys.TAB).
                    sendKeys("Uskudar").sendKeys(Keys.TAB).
                    sendKeys("Register").click().perform();
        }
    }