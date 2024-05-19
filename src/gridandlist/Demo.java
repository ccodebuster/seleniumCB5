package gridandlist;

import browserTesting.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Demo extends BaseTest {


    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setupTest() {
        openBrowser(baseUrl);
    }

    @Test
    public void test() {
        Actions actions = new Actions(driver);
        WebElement computerTabs = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]/a"));
        WebElement softwareLink = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]/ul/li[3]/a"));
        actions.moveToElement(computerTabs).moveToElement(softwareLink).click().build().perform();

        WebElement grid = driver.findElement(By.xpath("//a[@title='Grid']"));

        // System.out.println(grid.isDisplayed()); //true
        // System.out.println(grid.isEnabled()); //true

        Assert.assertTrue(grid.isDisplayed());
        Assert.assertTrue(grid.isEnabled());


      /*  WebElement list = driver.findElement(By.xpath("//a[@title='List']"));
        System.out.println(list.isEnabled()); //false---> */


    }


    @After
    public void tearDown() {
        // closeBrowser();
    }
}
