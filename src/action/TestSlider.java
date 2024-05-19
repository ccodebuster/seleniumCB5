package action;

import browserTesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestSlider extends BaseTest {

    String baseUrl = "https://www.geeksforgeeks.org/";

    @Before
    public void setupTest() {
        openBrowser(baseUrl);
    }

    @Test
    public void test() throws InterruptedException {
       /* JavascriptExecutor js = (JavascriptExecutor) driver; // not selenium methods
        Thread.sleep(2000); // stop java execution
        js.executeScript("window.scrollBy(0,2000)");*/

        Actions actions = new Actions(driver);
        for(int i =0; i<=2; i++){
            actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        }

        for(int i =0; i<=2; i++){
            actions.sendKeys(Keys.PAGE_UP).build().perform();
        }

        // scroll to specific element
        WebElement elementToScrollTo = driver.findElement(By.xpath("//div[text()='Binary Search']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);


        // scroll to bottom of page
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

        //scroll down by 500 pixels
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");

    }


    @After
    public void tearDown() {
        // closeBrowser();
    }
}
