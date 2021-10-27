package tests.homeworks;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Driver;

public class homework01 {
    /**
     * Part 1:
     *  Open "https://courses.ultimateqa.com/users/sign_up"
     *  create random and valid first name, last name, email and password, store for later validating
     *  fill in account submission form with data above
     *  Click on checkbox with id="user[terms]" to agree with terms and conditions
     *  click on "Sign up" button
     *  go to https://courses.ultimateqa.com/account
     *  validate that first name, last name and email you provided earlier is correct
     *
     * Part 2 (Optional)
     *  sign out of the website
     *  go to "https://courses.ultimateqa.com/users/sign_in"
     *  fill in sign in form with your stored email and password
     *  click on "Sign in" button
     *  validate that message "Signed in successfully." is displayed
     *
     * NOTE:Captcha on this website is un-avoidable,
     * so you will have to solve it by hand to allow script to continue
     **/
    @Test
    public void test01(){
        Driver.getDriver().get("https://courses.ultimateqa.com/users/sign_up");
        Actions actions = new Actions(Driver.getDriver());
        Faker faker= new Faker();

        String username = faker.name().name();
        String lastname = faker.name().lastName();
        String email = faker.internet().emailAddress();
        String password = faker.internet().password();

        actions.click(Driver.getDriver().findElement(By.id("user[first_name]"))).perform();
        actions.sendKeys(username)
                .sendKeys(Keys.TAB)
                .sendKeys(lastname)
                .sendKeys(Keys.TAB)
                .sendKeys(email)
                .sendKeys(Keys.TAB)
                .sendKeys(password)
                .sendKeys(Keys.TAB)
                .click().perform();

        Driver.getDriver().findElement(By.xpath("//input[@class='button button-primary g-recaptcha']")).click();

    }
}
