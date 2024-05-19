package windows;

import browserTesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class IframeDemo extends BaseTest {


    String baseUrl = "https://www.letskodeit.com/practice";

    @Before
    public void setupTest() {
        openBrowser(baseUrl);
    }

    @Test
    public void test() throws InterruptedException {
        //switch to iframe
        driver.switchTo().frame("courses-iframe");
       /* String dhavalProblem=driver.findElement(By.xpath("//div[@id='course-list']/div[1]/div/a/div[2]/h4")).getText();
        System.out.println(dhavalProblem);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='course-list']/div[1]/div[1]/a")).click();*/

        //find element in inframe and send keys
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("inside frame");

        //out from iframme
        driver.switchTo().defaultContent();


        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("outsideframe");






    }


    @After
    public void tearDown() {
        // closeBrowser();
    }
}
