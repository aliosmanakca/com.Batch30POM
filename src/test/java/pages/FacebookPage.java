package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage {
    WebDriver driver;
    public FacebookPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void cookiesGec(){
        driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _9xo7 _4jy3 _4jy1 selected _51sy']")).click();
    }

    @FindBy(xpath = "//input[@id='email']")
    public WebElement mailKutusu;

    @FindBy(xpath = "//input[@id='pass']")
    public WebElement sifreKutusu;

    @FindBy(xpath = "//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
    public WebElement login;

    @FindBy(xpath = "//div[@class='_9ay7']")
    public WebElement girilemediYaziElementi;

}
