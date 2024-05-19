package action;

import browserTesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Demo extends BaseTest {
    String baseUrl = "https://jqueryui.com/resources/demos/droppable/default.html";
    @Before
    public void setupTest() {
        openBrowser(baseUrl);
    }


    @Test
    public void test() {
        Actions actions = new Actions(driver);
        WebElement draggable=driver.findElement(By.id("draggable"));
        WebElement droppable=driver.findElement(By.id("droppable"));
        actions.dragAndDrop(draggable,droppable).build().perform();

    }


    @After
    public void tearDown() {
        // closeBrowser();
    }

}
