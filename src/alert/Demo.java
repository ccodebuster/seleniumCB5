package alert;

import browserTesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demo extends BaseTest {

    String baseUrl = "https://mail.rediff.com/cgi-bin/login.cgi";
    @Before
    public void setupTest() {
        openBrowser(baseUrl);
    }


    @Test
    public void test() {
        WebElement loginLink =driver.findElement(By.name("proceed"));
        loginLink.click();

        //Store the alert in a variable
        Alert alert = driver.switchTo().alert();

        //Store the alert in a variable for reuse
        String text = alert.getText();
        System.out.println(text);

        //Press the OK button
        alert.accept();

        //Press the Cancel button
       // alert.dismiss();

        //Type your message
        alert.sendKeys("Selenium");
    }


    @After
    public void tearDown() {
         closeBrowser();
    }
}
