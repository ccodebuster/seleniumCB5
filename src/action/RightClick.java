package action;

import browserTesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RightClick extends BaseTest {
    String baseUrl = "http://swisnl.github.io/jQuery-contextMenu/demo.html";

    @Before
    public void setupTest() {
        openBrowser(baseUrl);
    }

    @Test
    public void test() {
        Actions actions = new Actions(driver);
        WebElement rightLink =driver.findElement(By.xpath("//span[text()='right click me']"));
        actions.contextClick(rightLink).build().perform();
        driver.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[3]")).click();
        driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();

    }


    @After
    public void tearDown() {
        // closeBrowser();
    }
}
