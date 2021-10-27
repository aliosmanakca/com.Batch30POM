package tests.homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Driver;

public class homework02 {
    @Test
    public void test01() throws InterruptedException {
        //go to url : https://en.wikipedia.org/wiki/Dell
        Driver.getDriver().get("https://en.wikipedia.org/wiki/Dell");

        //go to table which name is 'List of companies acquired by Dell Inc.'
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

        //print row 5 of the table on console
        WebElement row5 = Driver.getDriver().findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']//tr[4]"));
        System.out.println(row5.getText());
        Thread.sleep(2000);

        //also print on console the 2nd and 3rd elements (middle 2 elements) in line 10
        System.out.println(findelements(10,1));
        System.out.println(findelements(10,2));

        //( 2nd and 3rd elements : April 2, 2012 A global market-leader for thin client systems)
    }
    public String findelements (int satir , int sutun){
        //   //table[@class='wikitable sortable jquery-tablesorter']//tr[9]//td[2]
        String xpath = "//table[@class='wikitable sortable jquery-tablesorter']//tr["+satir+"]//td["+sutun+"]";
        WebElement element = Driver.getDriver().findElement(By.xpath(xpath));
        return element.getText();
    }

}
