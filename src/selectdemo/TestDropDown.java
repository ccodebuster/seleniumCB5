package selectdemo;

import browserTesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestDropDown extends BaseTest {

    String baseUrl = "https://way2automation.com/way2auto_jquery/index.php";
    @Before
    public void setupTest() {
        openBrowser(baseUrl);
    }


    @Test
    public void test() {
       WebElement dropDown = driver.findElement(By.name("country"));
        Select select = new Select(dropDown);
        select.selectByValue("Dominica"); //select by valaue

    }


    @After
    public void tearDown() {
        closeBrowser();
    }

}
