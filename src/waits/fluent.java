package waits;

import browserTesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class fluent extends BaseTest {

    String baseUrl = "https://www.letskodeit.com/practice";

    @Before
    public void setupTest() {
        openBrowser(baseUrl);
    }

    @Test
    public void test() {
        WebElement signInLink =driver.findElement(By.xpath("//a[contains(text(),'Sign In')]"));

        Wait<WebDriver> wait = new FluentWait<>(driver)
                        .withTimeout(Duration.ofSeconds(50))
                        .pollingEvery(Duration.ofMillis(200))
                        .ignoring(ElementNotInteractableException.class);


        signInLink.click();



    }


    @After
    public void tearDown() {
        // closeBrowser();
    }
}
