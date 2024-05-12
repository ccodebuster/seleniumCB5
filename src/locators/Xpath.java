package locators;

import browserTesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class Xpath extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setupTest() {
        openBrowser(baseUrl);
    }


    @Test
    public void login() {
        //xpath-----> //tagName[@attribute='value']
        driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("mobile");
        driver.findElement(By.xpath("//input[@id='small-searchterms']")).clear();

        //xpath with "or" ---> //tagName[@attribute='value' or @attribute='value']
        driver.findElement(By.xpath("//input[@id='small-searchterms' or @name='q']")).sendKeys("computer");
        // driver.findElement(By.xpath("//input[@id='small-searchterms']")).clear();

        //xpath with "and"  ----> //tagName[@attribute='value' and @attribute='value']
        driver.findElement(By.xpath("//input[@id='small-searchterms' and @name='q']")).sendKeys("radio");
        driver.findElement(By.xpath("//input[@id='small-searchterms']")).clear();

        //xpath with "contains  --------> //tagName[contains(@attribute,'value')]
        driver.findElement(By.xpath("//input[contains(@id,'small-searchterms')]")).sendKeys("cars");
        driver.findElement(By.xpath("//input[@id='small-searchterms']")).clear();

        //xpath with "starts-with"  --------> //tagName[contains(@attribute,'value')]
        driver.findElement(By.xpath("//input[starts-with(@id,'small-searchterms')]")).sendKeys("selenium");

        //xpath with text -----> //tagName[text(),'text']
        driver.findElement(By.xpath("//a[text()='Log in']")).click();

        //xpath with  contains text ---> //tagName[contains(text(),'text')]
        driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();

        //chained xpath
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']")).click();

    }

    @After
    public void tearDown() {

        //closeBrowser();
    }
}
