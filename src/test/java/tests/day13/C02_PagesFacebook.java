package tests.day13;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.TestBase;

public class C02_PagesFacebook extends TestBase {
    @Test
    public void test01(){
        // facebook login sayfasina gidin
        driver.get("https://www.facebook.com");

        // page sayfasinda cookiesGec() method'u olusturun
        // kullanici adi : techproed@hotmail.com
        FacebookPage facebookPage = new FacebookPage(driver);
        facebookPage.mailKutusu.sendKeys("techproed@hotmail.com");

        // sifre : 12345
        facebookPage.sifreKutusu.sendKeys("12345");

        // login tusuna basin
        facebookPage.login.click();

        // yazdigimizda giris yapamadigimizi test edin
        Assert.assertTrue(facebookPage.girilemediYaziElementi.isDisplayed());
    }
}
