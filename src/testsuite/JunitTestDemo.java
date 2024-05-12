package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utils.Utility;


public class JunitTestDemo extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setupTest() {
        openBrowser(baseUrl);
    }


    @Test
    public void login() {
      /*  WebElement loginLink = driver.findElement("ico-login");
        loginLink.click();*/
        clickOnElement(By.className("ico-login"));
        String actualWelcomeText = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]")).getText();
        String expectingWelcomeText = "Welcome, Please Sign In";
        Assert.assertEquals("Validating welcome text",expectingWelcomeText,actualWelcomeText);


    }

    @Test
    public void register() {
        System.out.println("hi");
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
