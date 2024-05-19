package waits;

import browserTesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Explicit extends BaseTest {

    String baseUrl = "https://www.letskodeit.com/practice";

    @Before
    public void setupTest() {
        openBrowser(baseUrl);
    }

    @Test
    public void test() {
        WebElement signInLink =driver.findElement(By.xpath("//a[contains(text(),'Sign In')]"));

        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated((By) signInLink));
        wait.until(ExpectedConditions.elementToBeClickable((By) signInLink));

        signInLink.click();



    }


    @After
    public void tearDown() {
        // closeBrowser();
    }
}
